package com.example.aviasales.service.purchase;

import com.example.aviasales.domain.dto.PurchaseResponse;
import com.example.aviasales.domain.entity.Purchase;
import com.example.aviasales.mapper.PurchaseMapper;
import com.example.aviasales.repository.PurchaseRepository;
import com.example.aviasales.service.kafka.KafkaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseServiceImpl implements PurchaseService {
    private final PurchaseRepository purchaseRepository;
    private final PurchaseMapper purchaseMapper;
    private final KafkaService kafkaService;
    @Value("${spring.kafka.topic-notifications}")
    private String topic;

    @Override
    @Transactional
    public void create(Purchase purchase) {
        purchaseRepository.save(purchase);
        PurchaseResponse purchaseResponse = purchaseMapper.purchaseToResponse(purchase);
        kafkaService.sendToTopic(topic, purchaseResponse);
    }
}
