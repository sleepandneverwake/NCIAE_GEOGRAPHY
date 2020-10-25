package com.nciae.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nciae.po.Student;
import com.nciae.dao.StudentMapper;
import com.nciae.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YangChen
 * @since 2020-10-24
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Override
    public List<Student> findStudentsByName(String name) {
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        wrapper.like("name", name);
        List<Student> students = baseMapper.selectList(wrapper);
        return students;
    }

    @Override
    public Student findStudentByStuNo(String stuNo) {
        return null;
    }
}
