/*
 * Copyright (c) 2014 - 2017. Reno Shen. All rights Reserved.
 */

package com.demo.helloworld.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Configuration: Java Config.
 *
 * @author shen.zhibing
 * @version 1.00
 * @since 2017-01-20 9:18
 */
@SpringBootApplication
@ComponentScan("com.demo.helloworld.*")
public class Configuration {
}
