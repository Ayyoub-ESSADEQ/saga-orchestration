package com.microservice.order.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.order.DTO.Order;
import com.microservice.order.DTO.OrderRequestDTO;
import com.microservice.order.DTO.OrderResponseDTO;
import com.microservice.order.repository.OrderRepository;
import com.microservice.order.utils.OrderStatus;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public OrderResponseDTO create(OrderRequestDTO request) {
        Order order = new Order();
        order.setOrderId(request.getOrderId());
        order.setStatus(OrderStatus.ORDER_CREATED);
        orderRepository.save(order);

        OrderResponseDTO orderResponse = new OrderResponseDTO();
        orderResponse.setOrderId(request.getOrderId());
        orderResponse.setUserId(request.getUserId());
        orderResponse.setProductId(request.getProductId());
        orderResponse.setStatus(OrderStatus.ORDER_CREATED);
        return orderResponse;
    }

    public List<Order> getAll() {
        List<Order> orders = (List<Order>) orderRepository.findAll();
        return orders;
    }
}
