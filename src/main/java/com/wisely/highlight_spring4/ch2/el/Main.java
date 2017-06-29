package com.wisely.highlight_spring4.ch2.el;

import java.io.InputStream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;

/**
 * Created by wb-ljy189959 on 2017/6/28.
 */
public class Main {
    public static void main(String[] args) {
        /*AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ElConfig.class);*/

        AbstractApplicationContext context =
            new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();
        context.close();

        /*ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-resource.xml");
        Resource resource = ctx.getResource("classpath:com/wisely/highlight_spring4/ch2/el/test.properties");
        System.out.println(resource.getFilename());
        EncodedResource encodeResource = new EncodedResource(resource);
        InputStream stream = null;
        try {
            stream = encodeResource.getResource().getInputStream();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(stream);*/
    }
}
