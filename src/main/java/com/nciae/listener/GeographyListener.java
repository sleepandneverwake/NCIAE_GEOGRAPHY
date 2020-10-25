package com.nciae.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nciae.po.StudentGeography;
import com.nciae.service.StudentGeographyOptionService;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * 地理位置监听器
 */
@Component
public class GeographyListener {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private StudentGeographyOptionService studentGeographyOptionService;

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "mongoDB.queue", durable = "true"),
            exchange = @Exchange(
                    value = "studentGeography.exchange",
                    ignoreDeclarationExceptions = "true",
                    type = ExchangeTypes.TOPIC
            ),
            key = {"insert"}))
    public void listen(String message) throws IOException {
        StudentGeography studentGeography = objectMapper.readValue(message, StudentGeography.class);
        studentGeographyOptionService.insert(studentGeography);
    }
}