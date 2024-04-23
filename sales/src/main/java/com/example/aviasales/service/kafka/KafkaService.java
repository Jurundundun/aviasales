package com.example.aviasales.service.kafka;

public interface KafkaService {
    void sendToTopic(String topic, Object object);
}
