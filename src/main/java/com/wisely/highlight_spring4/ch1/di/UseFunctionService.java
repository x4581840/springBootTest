package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wb-ljy189959 on 2017/6/27.
 */
@Service
public class UseFunctionService {
    /*
    使用@Autowired将FunctionService的实体bean注入到UseFunctionService中，
    让UseFunctionService具备FunctionService的功能。
    此处使用JSR-330的@Inject注解或者JSR-250的@Resource注解是等效的。
     */
    @Autowired
    FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
