package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wb-ljy189959 on 2017/6/27.
 */
@Configuration //声明当前类是一个配置类
@ComponentScan("com.wisely.highlight_spring4.ch1.di")
//使用@ComponentScan，自动扫描包名下所有使用
// @Service,@Component,@Repository,@Controller的类，并注册为bean
public class DiConfig {

}
