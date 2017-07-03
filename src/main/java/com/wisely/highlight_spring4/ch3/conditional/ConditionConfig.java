package com.wisely.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wb-ljy189959 on 2017/7/3.
 */
@Configuration
public class ConditionConfig {

    //通过@Conditional注解，符合Windows条件则实例化，WindowsListService
    @Bean
    @Conditional(WindowsCondition.class)
    public WindowsListService windowsListService() {
        return new WindowsListService();
    }

    //通过@Conditional注解，符合Linux条件则实例化，LinuxListService
    @Bean
    @Conditional(LinuxCondition.class)
    public LinuxListService linuxListService() {
        return new LinuxListService();
    }
}
