package com.hariharan.springecom.model;

import com.hariharan.springecom.model.dto.Order;
import com.hariharan.springecom.model.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Product product;

    private int quantity;

    private BigDecimal totalPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;


}
