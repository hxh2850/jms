package com.softeem.client;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class ActiveMQServer {

   @JmsListener(destination = "softeem")
    public void receive(String message){
       System.out.println("收到消息："+message);
   }

}
