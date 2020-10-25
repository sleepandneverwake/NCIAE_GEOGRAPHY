package com.nciae.service.impl;

import com.nciae.po.StudentGeography;
import com.nciae.service.StudentGeographyOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentGeographyOptionServiceImpl implements StudentGeographyOptionService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void insert(StudentGeography studentGeography) {
        mongoTemplate.insert(studentGeography);
    }
}