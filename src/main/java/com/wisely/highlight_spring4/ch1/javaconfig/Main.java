package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	public static void main(String[] args) {
		//使用AnnotationConfigApplicationContext作为Spring容器，
        // 接受输入一个配置类作为参数
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(JavaConfig.class);
        //获得声明配置的UseFunctionService的bean
        UseFunctionService useFunctionService =
            context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("java config"));
        context.close();
	}
}
