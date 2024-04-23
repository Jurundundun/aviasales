package com.example.notification.service.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface KafkaService {
    void listenGroup(String message) throws JsonProcessingException, InterruptedException;
}
