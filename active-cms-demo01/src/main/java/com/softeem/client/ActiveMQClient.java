package com.softeem.client;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class ActiveMQClient {
    @Resource
    private JmsTemplate jmsTemplate;

    public void send(String message){
        jmsTemplate.convertAndSend("softeem",message);
    }
}
