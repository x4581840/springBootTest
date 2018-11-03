package com.wisely.highlight_spring4.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * Created by wb-ljy189959 on 2017/7/3.
 */

/**
 * 实现BeanNameAware和ResourceLoaderAware接口，
 * 获得Bean的名称和资源加载的服务
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{

    private String beanName;
    private ResourceLoader loader;

    //实现BeanNameAware需重写setBeanName方法
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    //实现ResourceLoaderAware需重写setResourceLoader方法
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult() {
        //bean的名称为：awareService
        System.out.println("bean的名称为：" + beanName);

        //classpath:com/wisely/highlight_spring4/ch3/aware/test.txt 写法不行
        Resource resource = loader.getResource("file:D:\\code\\springBootTest\\src\\main\\java\\com\\wisely\\highlight_spring4\\ch3\\aware\\test.txt");
        try {
            //ResourceLoader加载的文件内容是：java.io.BufferedInputStream@10eb4dba
            System.out.println("ResourceLoader加载的文件内容是："+resource.getInputStream());

            //ResourceLoader加载的文件内容是：我是测试内容
            System.out.println("ResourceLoader加载的文件内容是："+ IOUtils.toString(resource.getInputStream()));
        }catch (Exception e ) {
            e.printStackTrace();
        }
    }
}
