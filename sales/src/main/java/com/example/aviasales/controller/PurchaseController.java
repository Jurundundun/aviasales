package com.example.aviasales.controller;

import com.example.aviasales.domain.dto.PurchaseRequest;
import com.example.aviasales.domain.entity.Purchase;
import com.example.aviasales.mapper.PurchaseMapper;
import com.example.aviasales.service.purchase.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseService purchaseService;
    private final PurchaseMapper mapper;

    @PostMapping
    public void createPurchase(@RequestBody PurchaseRequest purchaseRequest) {
        Purchase purchase = mapper.requestToPurchase(purchaseRequest);
        purchaseService.create(purchase);
    }
}
