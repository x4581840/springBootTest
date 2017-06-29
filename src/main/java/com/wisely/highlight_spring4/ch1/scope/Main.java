package com.wisely.highlight_spring4.ch1.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wb-ljy189959 on 2017/6/28.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1和s2是否相等: " + s1.equals(s2)); //true
        System.out.println("p1和p2是否相等：" + p1.equals(p2)); //false
        context.close();
    }
}
