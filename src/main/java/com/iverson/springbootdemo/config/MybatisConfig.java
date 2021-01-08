package com.iverson.springbootdemo.config;

import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * @program: springboot-demo
 * @author: ouguoxin
 * @create: 2021-01-08 14:07
 **/


public class MybatisConfig implements TransactionManagementConfigurer {


    @Override
    public TransactionManager annotationDrivenTransactionManager() {
        return null;
    }
}

