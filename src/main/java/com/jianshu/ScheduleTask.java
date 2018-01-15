package com.jianshu;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Sunc on 2018/1/15.
 */
@Component
public class ScheduleTask {
    @Scheduled(cron = "0/5 * * * * ?")
    public void task(){
        System.out.println("开始执行任务...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务执行结束...");
    }
}
