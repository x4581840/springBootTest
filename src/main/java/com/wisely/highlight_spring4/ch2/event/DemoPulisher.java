package com.wisely.highlight_spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by wb-ljy189959 on 2017/6/29.
 * 事件发布类
 */
@Component
public class DemoPulisher {
    //注入ApplicationContext用来发布事件
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg) {
        //使用ApplicationContext的publishEvent方法发布事件
       applicationContext.publishEvent(new DemoEvent(this, msg));
    }

}
