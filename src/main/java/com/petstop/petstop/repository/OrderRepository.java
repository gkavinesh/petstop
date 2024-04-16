package com.petstop.petstop.repository;

import com.petstop.petstop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order,Long> {
}
