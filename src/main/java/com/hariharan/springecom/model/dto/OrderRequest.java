package com.hariharan.springecom.model.dto;

import java.math.BigDecimal;
import java.util.List;

public record OrderRequest(
        String customerName,
        String email,
        List<OrderItemRequest> items
) {
}
