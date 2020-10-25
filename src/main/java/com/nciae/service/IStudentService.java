package com.nciae.service;

import com.nciae.po.Student;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YangChen
 * @since 2020-10-24
 */
public interface IStudentService extends IService<Student> {

    /**
     * 根据学生姓名模糊查找学生
     * @param name
     * @return
     */
    List<Student> findStudentsByName(String name);

    /**
     * 根据学生学号查找学生信息
     * @param stuNo
     * @return
     */
    Student findStudentByStuNo(String stuNo);

}
