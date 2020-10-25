package com.nciae.po;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "student_geography")
public class StudentGeography {

    @Id
    private String id;

    private String stuNo;

    private String name;

    private String latitude;

    private String longtitude;

    private Date createTime;

    public StudentGeography() {
    }

    public StudentGeography(String stuNo, String name, String latitude, String longtitude, Date createTime) {
        this.stuNo = stuNo;
        this.name = name;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "StudentGeography{" +
                "id='" + id + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", name='" + name + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longtitude='" + longtitude + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}