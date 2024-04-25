package com.petstop.petstop.controller;

import com.petstop.petstop.entity.Appointment;
import com.petstop.petstop.entity.Order;
import com.petstop.petstop.service.OrderService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class OrderController {

    private final  OrderService orderService;

    @PostMapping("/order")
    public Order postOrder(@RequestBody Order order){
        return orderService.postOrder(order);
    }


    @GetMapping("/order")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable Long id){
        try{
            orderService.deleteOrder(id);
            return new ResponseEntity<>( "Order with ID" + id + " deleted successfully", HttpStatus.OK);

        }catch(EntityNotFoundException e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<?> getOrderById(@PathVariable Long id){
        Order order = orderService.getOrderByID(id);
        if(order == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(order);
    }

    @PatchMapping("/order/{id}")
    public ResponseEntity<?> updateOrder(@PathVariable Long id, @RequestBody Order order){
        Order updatedOrder = orderService.updateOrder(id,order);

        if(updatedOrder == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        return ResponseEntity.ok(updatedOrder);
    }



}