/*
 * Copyright (c) 2014 - Reno Shen. All rights Reserved.
 */

package com.demo.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Configuration: Configuration.
 *
 * @author shen.zhibing
 * @version 1.00
 * @since 2017-01-18 17:56
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/")
    public String config(ModelMap modelMap) {
        modelMap.addAttribute("name", "Reno Shen");
        modelMap.addAttribute("url", "https://www.google.com");
        return "home";
    }

}
