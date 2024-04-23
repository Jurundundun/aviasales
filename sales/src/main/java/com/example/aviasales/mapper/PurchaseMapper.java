package com.example.aviasales.mapper;

import com.example.aviasales.domain.dto.PurchaseRequest;
import com.example.aviasales.domain.dto.PurchaseResponse;
import com.example.aviasales.domain.entity.Purchase;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PurchaseMapper {
    Purchase requestToPurchase(PurchaseRequest purchaseRequest);
    PurchaseResponse purchaseToResponse(Purchase purchase);
}
