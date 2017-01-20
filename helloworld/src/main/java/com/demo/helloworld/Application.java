/*
 * Copyright (c) 2014 - 2017. Reno Shen. All rights Reserved.
 */
package com.demo.helloworld;

import com.demo.helloworld.config.XYZConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * com.demo.springboot.Application: Spring Boot Demo.
 *
 * @author shen.zhibing
 * @version 1.00
 * @since 2017-01-18 17:54
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 启动服务
        SpringApplication.run(XYZConfig.class, args);
    }
}
