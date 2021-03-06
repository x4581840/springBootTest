package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by wb-ljy189959 on 2017/6/27.
 * 使用注解的被拦截类
 */
@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截的add操作", address="address1")
    public void add(){}

    @Action(name="注解式拦截的operate操作", address="address2")
    public void operate(){}
    
    @Action(name = "注解delete", address="address3")
    public void delete() {}
}
