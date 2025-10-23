package com.quickshop.product;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Product Service!";
    }
}

