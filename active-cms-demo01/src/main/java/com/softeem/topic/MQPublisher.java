package com.softeem.topic;


import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.Topic;

@Component
public class MQPublisher {

    @Resource
    private Topic topic;

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendTopic(String msg){
        System.out.println("发送topic消息内容："+msg);
        this.jmsMessagingTemplate.convertAndSend(topic,msg);
    }
}
