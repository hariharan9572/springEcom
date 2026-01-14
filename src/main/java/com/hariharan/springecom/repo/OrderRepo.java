package com.hariharan.springecom.repo;

import com.hariharan.springecom.model.dto.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

   Optional<Order> findByOrderID(String orderId);

}
