package com.example.aviasales.service.purchase;

import com.example.aviasales.domain.entity.Purchase;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface PurchaseService {
    void create(Purchase purchase);
}
