package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wb-ljy189959 on 2017/6/29.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPulisher demoPulisher = context.getBean(DemoPulisher.class);
        demoPulisher.publish("hello application event");
        context.close();
    }
}
