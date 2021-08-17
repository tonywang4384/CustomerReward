package com.bht.customer_reward.controller;

import com.bht.customer_reward.helper.Calculation;
import com.bht.customer_reward.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(value = "/test")
    public String Hello () {
        return "Hello World";
    }

    @GetMapping(value = "reward/{spent}")
    public int getRewardTest(@PathVariable int spent) {
        return Calculation.calculate(spent);
    }

    private OrderService service;

    @Autowired
    public void setOrderService (OrderService orderService) {
        this.service = orderService;
    }

    @GetMapping(value = "/demo/{customer_id}")
    public int getRewardById(@PathVariable int customer_id) {
        return service.calculateById(customer_id);
    }
}
