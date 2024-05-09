package com.microservice.orchestrator.controller;

import org.springframework.web.bind.annotation.RestController;

import com.microservice.orchestrator.DTO.OrchestratorResponseDTO;
import com.microservice.orchestrator.DTO.OrderRequestDTO;
import com.microservice.orchestrator.Steps.OrderStep;
import com.microservice.orchestrator.Steps.PaymentStep;
import com.microservice.orchestrator.Steps.Step;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController("order-processing")
public class OrderProcessingController {
    @PostMapping("/orders")
    public String processOrder(@RequestBody OrderRequestDTO request) {
        OrderStep orderStep = new OrderStep();
        System.out.println(orderStep.process(request));
        return "Hello world";
    }

}
