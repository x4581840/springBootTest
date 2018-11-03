package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wb-ljy189959 on 2017/6/29.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext();

        //先将活动的profile设置为prod
        //然后注册Bean配置类，不注册的话会报Bean未定义错误
        //刷新容器
        //context.getEnvironment().setActiveProfiles("prod");
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();

        /*
        这样写会报错误的(Exception in thread "main"
        java.lang.IllegalStateException:GenericApplicationContext does not
        support multiple refresh attempts:just call 'refresh' once)

        下面的构造方法里面已经调用过一次refresh方法了
        public AnnotationConfigApplicationContext(Class... annotatedClasses) {
            this();
            this.register(annotatedClasses);
            this.refresh();
        }
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ProfileConfig.class);

        //先将活动的profile设置为prod
        //刷新容器
        context.getEnvironment().setActiveProfiles("prod");
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();*/
    }
}
