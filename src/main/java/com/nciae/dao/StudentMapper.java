package com.nciae.dao;

import com.nciae.po.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YangChen
 * @since 2020-10-24
 */
@Mapper
@Repository
public interface StudentMapper extends BaseMapper<Student> {

}
