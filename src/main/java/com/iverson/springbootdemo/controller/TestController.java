package com.iverson.springbootdemo.controller;

import com.iverson.springbootdemo.domain.Test;
import com.iverson.springbootdemo.service.TestService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springboot-demo
 * @author: ouguoxin
 * @create: 2021-01-08 13:32
 **/

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Test selectById(@Param("id") Integer id) {
        Test test = testService.selectById(id);
        return test;
    }

}

