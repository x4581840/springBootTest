package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wb-ljy189959 on 2017/6/27.
 */
//声明当前类是一个配置类，这意味着这个类里可能有0个或者多个@Bean注解，
//此处没有使用包扫描，是因为所有的Bean都在此类中定义了
@Configuration
public class JavaConfig {

    @Bean //注解在方法上，声明当前方法的返回值为一个bean，bean的名称是方法名
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService() {
        UseFunctionService useFunctionService = new UseFunctionService();
        //注入FunctionService的bean时候直接调用functionService()
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

    /*
        这是另外一种注入的方式，直接将FunctionService作为参数给useFunctionService()
        这也是Spring容器提供的极好的功能。在Spring容器中，只要容器中存在某个Bean，
        就可以在另外一个Bean的声明方法的参数中写入
     */
    /*@Bean
    public UseFunctionService useFunctionService(FunctionService functionService) {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }*/
}
