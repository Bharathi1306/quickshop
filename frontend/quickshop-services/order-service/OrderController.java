package com.quickshop.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    // Replace with the correct User Service URL
    private final String USER_SERVICE_URL = "http://localhost:8081/users/hello";

    @GetMapping("/orders/user-hello")
    public String getUserHello() {
        try {
            // Call User Service
            String userResponse = restTemplate.getForObject(USER_SERVICE_URL, String.class);
            return "Order Service received: " + userResponse;
        } catch (Exception e) {
            return "Failed to reach User Service: " + e.getMessage();
        }
    }

    @GetMapping("/orders/hello")
    public String helloOrder() {
        return "Hello from Order Service!";
    }
}

