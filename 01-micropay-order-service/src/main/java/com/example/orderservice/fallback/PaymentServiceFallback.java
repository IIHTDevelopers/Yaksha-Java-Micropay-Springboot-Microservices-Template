package com.example.orderservice.fallback;

import org.springframework.stereotype.Component;

// Fill Your Code
public class PaymentServiceFallback implements PaymentServiceClient {

    @Override
    public String makePayment(Long userId, Double amount) {
        // Fallback logic when the Payment Service is unavailable
        // Fill Your Code
    }
}
