package com.example.aviasales.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequest {
    private String fio;
    private String flightNumber;
    private Date departureDate;
}
