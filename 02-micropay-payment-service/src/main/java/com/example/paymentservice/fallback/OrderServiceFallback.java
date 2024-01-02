package com.example.paymentservice.feign;

import org.springframework.stereotype.Component;

// Fill Your Code
public class OrderServiceFallback implements OrderServiceClient {

    @Override
    public String updateOrderStatus(Long userId, Double amount) {
        // Fallback logic when the Order Service is unavailable

        // Fill Your Code
    }
}
