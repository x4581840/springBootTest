package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by wb-ljy189959 on 2017/6/29.
 * 事件监听器
 */
@Component
//实现ApplicationListener接口，并指定监听的事件类型
public class DemoListener implements ApplicationListener<DemoEvent> {

    //使用onApplicationEvent方法对消息进行接收处理
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我(bean-demoListener)接收到了(bean-demoPublisher)发布的消息:"+msg);
    }
}
