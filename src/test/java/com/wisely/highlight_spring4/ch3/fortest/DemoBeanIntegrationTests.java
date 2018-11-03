package com.wisely.highlight_spring4.ch3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wb-ljy189959 on 2017/7/3.
 * 集成测试
 */

/**
 * SpringJUnit4ClassRunner在JUnit环境下提供Spring TextContext framework的功能
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration用来加载配置ApplicationText,
//其中classes是属性用来加载配置类
@ContextConfiguration(classes = {TestConfig.class})
//声明活动的profile
@ActiveProfiles("prod") //测试通过
//@ActiveProfiles("dev") //测试不通过
public class DemoBeanIntegrationTests {

	//可以使用普通的@Autowired注入bean
    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject() {
        String exceped = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(exceped, actual);
    }
}
