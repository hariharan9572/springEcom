package com.hariharan.springecom.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {
}
