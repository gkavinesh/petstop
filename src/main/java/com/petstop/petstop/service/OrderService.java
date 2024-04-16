package com.petstop.petstop.service;

import lombok.RequiredArgsConstructor;
import com.petstop.petstop.entity.Order;
import com.petstop.petstop.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Order postOrder(Order order){
        return orderRepository.save(order);
    }

}
