package com.jianshu;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Sunc on 2018/1/13.
 */
@Component
public class RabbitmqListener {
    @RabbitListener(queues = "test_mq")
    @RabbitHandler
    public void process(String message){
        System.out.println("接收到的消息"+message);
    }
}
