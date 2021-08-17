package com.bht.customer_reward.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bht.customer_reward.model.Order;
import org.springframework.stereotype.Component;


@Component
public class OrderRepository {

    // Some order history data are hardcoded here since there is no database
    private static List<Order> orders;
    static {
        orders = new ArrayList<>();
        orders.add(new Order(1, 159, 96, Timestamp.valueOf("2021-07-02 09:01:16")));
        orders.add(new Order(2, 159, 128, Timestamp.valueOf("2021-08-11 16:41:25")));
        orders.add(new Order(3, 159, 17, Timestamp.valueOf("2021-04-06 02:51:02")));
        orders.add(new Order(4, 159, 51, Timestamp.valueOf("2021-07-20 09:21:45")));
        orders.add(new Order(5, 159, 144, Timestamp.valueOf("2021-08-15 02:41:04")));
        orders.add(new Order(6, 73, 144, Timestamp.valueOf("2021-08-15 02:41:04")));
        orders.add(new Order(7, 73, 101, Timestamp.valueOf("2021-08-12 01:41:04")));
    }

    // emulation of sql select
    public List<Order> getOrdersByCustomerId(int id) {
        return orders.stream().filter(o -> o.getCustomerId() == id).collect(Collectors.toList());
    }
}
