package com.ljy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wb-ljy189959 on 2017/6/22.
 * Hello控制器
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/test.htm")
    public String hello(ModelMap modelMap) {
        modelMap.addAttribute("message", "hello,world!");
        return "test";//vm的名字
    }
}
