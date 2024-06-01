package com.example.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ListenerService {

    public static final String TOPIC_NAME = "tpc1";

  //  @KafkaListener(topics = TOPIC_NAME)
    public void listen(String message) {
        System.out.println("Get message:" + message);
    }
}
