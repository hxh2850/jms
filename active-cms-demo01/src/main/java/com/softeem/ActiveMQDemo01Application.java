package com.softeem;

import com.softeem.client.ActiveMQClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@SpringBootApplication
public class ActiveMQDemo01Application {
    public static void main(String[] args) {
        SpringApplication.run(ActiveMQDemo01Application.class,args);
    }

    @Resource
    private ActiveMQClient client;
    @PostConstruct
    public void init(){
        long begin = System.currentTimeMillis();
        for(int i =0;i<1000;i++){
            client.send("发送消息！！   softeem-----: "+i);
        }
        long end = System.currentTimeMillis();
        System.out.println("发送消息耗时"+(end-begin)+"ms");
    }
}
