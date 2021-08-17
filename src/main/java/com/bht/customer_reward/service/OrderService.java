package com.bht.customer_reward.service;

import com.bht.customer_reward.dao.OrderRepository;
import com.bht.customer_reward.helper.Calculation;
import com.bht.customer_reward.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderService {

    @Autowired
    OrderRepository repo;

    public int calculateById (int id) {
        List<Order> orders = repo.getOrdersByCustomerId(id);
        LocalDate currentDateMinus3Months = LocalDate.now().minusMonths(3);
        List<Order> recentOrders = orders.stream()
                .filter(o -> o.getTimestamp().toLocalDateTime().toLocalDate().isAfter(currentDateMinus3Months))
                .collect(Collectors.toList());
        return recentOrders.stream().map(order -> Calculation.calculate(order.getAmount())).reduce(0, Integer::sum);
    }

}
