package com.quickshop.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Order Service!";
    }

    // Call User Service
    @GetMapping("/user-hello")
    public String callUserService() {
        String url = "http://localhost:8081/users/hello"; // change port if your User Service is different
        return restTemplate.getForObject(url, String.class);
    }

    // Call Product Service
    @GetMapping("/product-hello")
    public String callProductService() {
        String url = "http://localhost:8083/products/hello"; // Product Service URL
        return restTemplate.getForObject(url, String.class);
    }
}

