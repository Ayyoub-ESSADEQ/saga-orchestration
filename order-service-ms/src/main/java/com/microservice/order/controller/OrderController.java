package com.microservice.order.controller;

import org.springframework.web.bind.annotation.RestController;

import com.microservice.order.DTO.Order;
import com.microservice.order.DTO.OrderRequestDTO;
import com.microservice.order.DTO.OrderResponseDTO;
import com.microservice.order.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController("order")
public class OrderController {

    @Autowired
    OrderService inventoryService;

    @PostMapping("/create")
    public ResponseEntity<OrderResponseDTO> create(@RequestBody OrderRequestDTO requestBody) {
        OrderResponseDTO inventoryResponse = inventoryService.create(requestBody);
        return ResponseEntity.ok().body(inventoryResponse);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Order>> getOrders() {
        List<Order> orders = inventoryService.getAll();
        return ResponseEntity.ok().body(orders);
    }
}
