package com.softeem.topic;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MQSubClient {


    @JmsListener(destination = "softeem.topic")
    public void receiveTopic1(String message){
        System.out.println("receiveTopic1 收到消息"+message);
    }

    @JmsListener(destination = "softeem.topic")
    public void receiveTopic2(String message){
        System.out.println("receiveTopic1 收到消息"+message);
    }



}
