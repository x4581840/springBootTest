package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wb-ljy189959 on 2017/6/28.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService =
            context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService =
            context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoAnnotationService.operate();

        demoMethodService.add();

        demoMethodService.operate();

        context.close();
    }
}