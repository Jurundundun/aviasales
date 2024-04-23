package com.example.aviasales.service.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class KafkaServiceImpl implements KafkaService {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    @Override
    public void sendToTopic(String topic, Object object) {
        try {
            String jsonObject = objectMapper.writeValueAsString(object);
            kafkaTemplate.send(topic, jsonObject);
        } catch (JsonProcessingException e) {
            log.error(e.getLocalizedMessage());
        }
    }
}
