package com.example.notification.service.kafka;

import com.example.notification.domain.dto.PurchaseResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaServiceImpl implements KafkaService {
    private final ObjectMapper objectMapper;

    @Override
    @KafkaListener(topics = "notification")
    public void listenGroup(String message) throws JsonProcessingException, InterruptedException {
        PurchaseResponse purchaseResponse = objectMapper.readValue(message, PurchaseResponse.class);
        Thread.sleep((long) (3000 + Math.random() * 1000));
        System.out.println(purchaseResponse);
    }
}
