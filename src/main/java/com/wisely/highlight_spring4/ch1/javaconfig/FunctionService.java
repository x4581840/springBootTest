package com.wisely.highlight_spring4.ch1.javaconfig;

/**
 * Created by wb-ljy189959 on 2017/6/27.
 */
//@Bean 注解在方法上，声明当前方法的返回值为一个bean

public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
