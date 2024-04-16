package com.petstop.petstop.controller;

import com.petstop.petstop.entity.Order;
import com.petstop.petstop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OrderController {

    private final  OrderService orderService;

    @PostMapping("/order")
    public Order postOrder(@RequestBody Order order){
        return orderService.postOrder(order);
    }



}