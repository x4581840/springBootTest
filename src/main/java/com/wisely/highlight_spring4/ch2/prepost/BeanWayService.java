package com.wisely.highlight_spring4.ch2.prepost;

/**
 * Created by wb-ljy189959 on 2017/6/29.
 */
//使用@Bean形式的Bean
public class BeanWayService {

    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destory() {
        System.out.println("@Bean-destory-method");
    }
}
