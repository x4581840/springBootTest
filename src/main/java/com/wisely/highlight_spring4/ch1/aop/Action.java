package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wb-ljy189959 on 2017/6/27.
 * 拦截规则的注解
 * 注解本身是没有功能的，就和xml一样，注解和xml都是一种元数据，
 * 元数据即解释数据的数据，这就是所谓的配置
 * 注解的功能来自用这个注解的地方
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
