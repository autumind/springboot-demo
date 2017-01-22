/*
 * Copyright (c) 2014 - Reno Shen. All rights Reserved.
 */

package com.demo.configuration.controller;

import com.demo.configuration.config.DemoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Configuration: Configuration.
 *
 * @author shen.zhibing
 * @version 1.00
 * @since 2017-01-18 17:56
 */
@RestController
public class ConfigurationController {

    @Autowired
    private DemoConfig config;

    @RequestMapping("/config")
    public DemoConfig config() {
        return config;
    }

}
