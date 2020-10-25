package com.nciae.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author YangChen
 * @since 2020-10-24
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学生学号
     */
    @TableId("stuNo")
    private String stuNo;

    /**
     * 性别编码
     */
    private String gender;

    /**
     * 主要学院
     */
    private String marjor;

    /**
     * 学院编码
     */
    @TableField("marjorCode")
    private String marjorCode;

    /**
     * 班级编码
     */
    @TableField("classCode")
    private String classCode;

    /**
     * 班级编号
     */
    @TableField("classNo")
    private String classNo;

    /**
     * 年纪号
     */
    @TableField("gradeNo")
    private String gradeNo;

    /**
     * 姓名
     */
    private String name;

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getMarjor() {
        return marjor;
    }

    public void setMarjor(String marjor) {
        this.marjor = marjor;
    }
    public String getMarjorCode() {
        return marjorCode;
    }

    public void setMarjorCode(String marjorCode) {
        this.marjorCode = marjorCode;
    }
    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }
    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }
    public String getGradeNo() {
        return gradeNo;
    }

    public void setGradeNo(String gradeNo) {
        this.gradeNo = gradeNo;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
            "stuNo=" + stuNo +
            ", gender=" + gender +
            ", marjor=" + marjor +
            ", marjorCode=" + marjorCode +
            ", classCode=" + classCode +
            ", classNo=" + classNo +
            ", gradeNo=" + gradeNo +
            ", name=" + name +
        "}";
    }
}
