package com.cyq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/zk")
    public String getPayment() {
        return "Welcome to zookeeper world, the id is " + UUID.randomUUID().toString();
    }

}
