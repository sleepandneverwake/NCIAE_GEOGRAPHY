package com.nciae.service;

import com.nciae.po.StudentGeography;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface StudentGeographyService extends MongoRepository<StudentGeographyService,String> {

//    List<StudentGeography> findAllBy
}
