package com.wisely.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by wb-ljy189959 on 2017/7/3.
 */
@Service
public class SchedulerTaskService {
    private static final SimpleDateFormat dateFormat =
        new SimpleDateFormat("HH:mm:ss");

    //声明该方法是计划任务，使用fixedRate属性每隔固定时间执行
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次（fixedRate）："+ dateFormat.format(new Date()));
    }

    //声明该方法是计划任务，使用fixedRate属性每隔固定时间执行
    @Scheduled(fixedDelay = 3000)
    public void reportCurrentTime1() {
        System.out.println("每隔三秒执行一次（fixedDelay）："+ dateFormat.format(new Date()));
    }

    //使用cron属性可按照指定时间执行，
    //本例指的是每天11点28分执行；
    //cron是UNIX和类UNIX(linux)系统下的定时任务
    @Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecution() {
        System.out.println("在指定时间"+dateFormat.format(new Date())+"执行");
    }
}
