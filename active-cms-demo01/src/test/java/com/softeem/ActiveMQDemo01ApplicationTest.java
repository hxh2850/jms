package com.softeem;

import com.softeem.topic.MQPublisher;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@RunWith(SpringRunner.class)
class ActiveMQDemo01ApplicationTest {

    @Resource
    private MQPublisher mqPublisher;

    @Test
    public void test() {

        mqPublisher.sendTopic("老子天下第一");
    }
}
