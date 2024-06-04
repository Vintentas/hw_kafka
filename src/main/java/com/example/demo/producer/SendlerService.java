package com.example.demo.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

import static com.example.demo.config.configurationProducer.TOPIC_NAME;

@Service
@RequiredArgsConstructor
public class SendlerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String key, String message) {
        System.out.println("message send " + key + " " + message);
        kafkaTemplate.send(TOPIC_NAME, key, message);
    }

}
