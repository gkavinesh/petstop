package com.petstop.petstop.service;

import com.petstop.petstop.entity.Appointment;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import com.petstop.petstop.entity.Order;
import com.petstop.petstop.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Order postOrder(Order order){
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();

    }

    public void deleteOrder(Long id){
        if(!orderRepository.existsById(id)){
            throw new EntityNotFoundException("Order with ID " + id + " not found");
        }

        orderRepository.deleteById(id);
    }

    public Order getOrderByID(Long id){
        return orderRepository.findById(id).orElse(null);
    }

    public Order updateOrder(Long id,Order order){
        Optional<Order> optionalOrder = orderRepository.findById(id);
        if(optionalOrder.isPresent()){
            Order existingOrder = optionalOrder.get();

            existingOrder.setContactEmail(order.getContactEmail());

            existingOrder.setItemname(order.getItemname());
            existingOrder.setQuantity(order.getQuantity());

            return orderRepository.save(existingOrder);

        }
        return null;
    }


}
