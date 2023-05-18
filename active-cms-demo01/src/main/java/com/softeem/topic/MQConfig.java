package com.softeem.topic;


import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Topic;

@Configuration
public class MQConfig {

    @Bean
    Topic topic(){
        return new ActiveMQTopic("softeem.topic");
    }
}
