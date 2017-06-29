package com.ljy.example;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wb-ljy189959 on 2017/6/22.
 * Spring-MVC的控制部分
 */
@Controller
public class HelloController {
    //@RequestMapping("/index")
    public String index(){
        return "welcome";
    }
}
