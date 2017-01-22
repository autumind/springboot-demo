/*
 * Copyright (c) 2014 - Reno Shen. All rights Reserved.
 */

package com.demo.configuration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Configuration: Java Config.
 *
 * @author shen.zhibing
 * @version 1.00
 * @since 2017-01-20 9:18
 */
@Component
@ConfigurationProperties(prefix = "demo", locations = "classpath:demo-config.yml")
public class DemoConfig {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
