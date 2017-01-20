/*
 * Copyright (c) 2014 - 2017. Reno Shen. All rights Reserved.
 */

package com.demo.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorld: Hello World.
 *
 * @author shen.zhibing
 * @version 1.00
 * @since 2017-01-18 17:56
 */
@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }

}
