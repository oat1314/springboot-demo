package com.iverson.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan("com.iverson.springbootdemo.mapper")
public class SpringbootDemoApplication {

    private static final Logger LOG = LoggerFactory.getLogger(SpringbootDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootDemoApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("项目启动地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
