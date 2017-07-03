package com.wisely.highlight_spring4.ch3.fortest;

/**
 * Created by wb-ljy189959 on 2017/7/3.
 * 集成测试Bean
 */
public class TestBean {
    private String content;

    public TestBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
