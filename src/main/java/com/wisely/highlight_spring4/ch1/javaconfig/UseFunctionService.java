package com.wisely.highlight_spring4.ch1.javaconfig;

import com.wisely.highlight_spring4.ch1.javaconfig.FunctionService;

/**
 * Created by wb-ljy189959 on 2017/6/27.
 */
//没有使用@Service声明bean
public class UseFunctionService {

    //没有使用@autowired注解注入bean
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
