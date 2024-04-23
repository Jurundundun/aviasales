package com.example.notification.domain.dto;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PurchaseResponse {
    private String fio;
    private String flightNumber;
    private Date departureDate;
}
