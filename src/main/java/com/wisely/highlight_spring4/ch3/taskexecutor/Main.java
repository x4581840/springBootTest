package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wb-ljy189959 on 2017/7/3.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for(int i=0; i< 10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executorAsyncTaskPlus(i);
        }
        context.close();
        //结果是并发执行而不是顺序执行
    }
}
