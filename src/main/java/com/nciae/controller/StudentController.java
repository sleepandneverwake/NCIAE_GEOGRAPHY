package com.nciae.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nciae.po.Student;
import com.nciae.po.StudentGeography;
import com.nciae.service.IStudentService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author YangChen
 * @since 2020-10-24
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private AmqpTemplate amqpTemplate;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/{name}")
    public ResponseEntity<List<Student>> findStudentByName(@PathVariable("name") String name) {
        List<Student> students = studentService.findStudentsByName(name);
        return ResponseEntity.ok(students);
    }

//    @PostMapping
//    public ResponseEntity<String> postCollection() {
//        mongoTemplate.dropCollection(StudentGeography.class);
//        mongoTemplate.createCollection(StudentGeography.class);
//        return ResponseEntity.ok("成功");
//    }
//
//    @GetMapping
//    public String get() {
//        List<StudentGeography> all = mongoTemplate.findAll(StudentGeography.class);
//        return all.toString();
//    }

    /**
     * 接收微信发送过来的消息，发送消息给消息队列，存储到MongoDB中做数据分析
     * @param studentGeography：发送的消息
     * @return
     * @throws JsonProcessingException：转化JSON字符串异常
     */
    @GetMapping("/listener")
    public ResponseEntity<String> listenWxMessage(StudentGeography studentGeography) throws JsonProcessingException {
        String studentGeographyJson = objectMapper.writeValueAsString(studentGeography);
        amqpTemplate.convertAndSend("studentGeography.exchange", "insert", studentGeographyJson);
        return ResponseEntity.ok("发送消息成功");
    }

}
