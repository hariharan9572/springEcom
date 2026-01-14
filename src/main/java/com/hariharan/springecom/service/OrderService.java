package com.hariharan.springecom.service;

import com.hariharan.springecom.model.dto.Order;
import com.hariharan.springecom.model.dto.OrderRequest;
import com.hariharan.springecom.model.dto.OrderResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    public OrderResponse placeOrder(OrderRequest request) {

        Order order = new Order();
        String orderId = "ORD" + UUID.randomUUID().toString().substring(0,8).toUpperCase();
        order.setOrderId(orderId);
        order.setCustomerName(request.customerName());
        order.setEmail(request.email());
        order.setStatus("PLACED");
        order.setOrderDate(LocalDate.now());


        return null;
    }

    public List<OrderResponse> getAllOrderResponses() {
        return null;
    }
}
