package com.jianshu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Sunc on 2018/1/13.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestRabbitmq {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /*发送消息*/
    @Test
    public void testSend(){
        rabbitTemplate.convertAndSend("test_mq","Spring Boot发送消息");
    }
}
