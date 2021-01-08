package com.iverson.springbootdemo.service.impl;

import com.iverson.springbootdemo.domain.Test;
import com.iverson.springbootdemo.mapper.TestMapper;
import com.iverson.springbootdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-demo
 * @author: ouguoxin
 * @create: 2021-01-08 10:15
 **/

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;

    @Override
    public Test selectById(Integer id) {
        Test test = testMapper.selectByPrimaryKey(id);
        return test;
    }
}

