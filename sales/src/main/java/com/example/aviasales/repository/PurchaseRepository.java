package com.example.aviasales.repository;

import com.example.aviasales.domain.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PurchaseRepository extends JpaRepository<Purchase, UUID> {
}
