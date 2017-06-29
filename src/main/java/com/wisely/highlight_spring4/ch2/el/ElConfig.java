package com.wisely.highlight_spring4.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * Created by wb-ljy189959 on 2017/6/28.
 */
@Configuration
@ComponentScan(basePackages = "com.wisely.highlight_spring4.ch2.el")
//(@PropertySource注解用来指定要读取的配置文件的路径从而读取这些配置文件，可以同时指定多个配置文件；)
//@PropertySource(value = {"classpath:common.properties", "classpath:abc.properties"})
//使用@PropertySource注解注入配置文件，指定文件地址,若使用@Value注入，
//则要配置一个PropertySourcesPlaceholderConfigurer的Bean，而且必须是static
//注意，@Value("${book.name}")使用的是"$",而不是"#"
//注入Properties还可以从Environment中获得
/*他妈的，下面写相对路径和绝对路径总会报FileNoFoundException*/
//@PropertySource(value = "classpath:com/wisely/highlight_spring4/ch2/el/test1.properties",ignoreResourceNotFound=true)
//@PropertySource(value = "classpath*:com/wisely/highlight_spring4/ch2/el/test1.properties")
//@PropertySource(value = { "D:/myTest/spring-boot-test/src/main/java/com/wisely/highlight_spring4/ch2/el/test1.properties" })
//下面两种写法可以
//@PropertySource("file:D:\\myTest\\spring-boot-test\\src\\main\\java\\com\\wisely\\highlight_spring4\\ch2\\el\\test1.properties")
//@PropertySource("file:D:/myTest/spring-boot-test/src/main/java/com/wisely/highlight_spring4/ch2/el/test1.properties")

public class ElConfig {
    //注入普通字符串
    @Value("I love you!")
    private String normal;
    //注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;
    //注入表达式结果
    @Value("#{ T(java.lang.Math).random() * 100.0}")
    private double randomNmuber;
    //注入其他bean属性
    @Value("#{demoService.another}")
    private String fromAnother;
    //注入文件资源
    //@Value("classpath:com/wisely/highlight_spring4/ch2/el/test.txt") FileNotFoundException
    @Value("file:D:/myTest/spring-boot-test/src/main/java/com/wisely/highlight_spring4/ch2/el/test.txt")
    private Resource testFile;
    //注入网址资源
    @Value("http://www.baidu.com")
    private Resource testUrl;
    //注入配置文件
    @Value("${book.name}")
    private String bookName;

    //注入的properties还可以从Environment中获得
    //Environment bean被Spring自动注入。
    // 另外，由于配置了@PropertySoruce注解，
    // Environment bean可以访问指定配置文件里定义的所有属性值。
    // 你可以使用getProperty方法得到指定值。
    //environment.getProperty("book.author")
    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNmuber);
            System.out.println(fromAnother);
            //如果上面的propertyConfigure返回值没有用static修饰，就会报空指针异常
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));

        }catch (Exception  e) {
            e.printStackTrace();
        }
    }
}
