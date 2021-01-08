package com.iverson.springbootdemo.service;

import com.iverson.springbootdemo.domain.Test;

public interface TestService {

    Test selectById(Integer id);
}
