package com.bht.customer_reward.model;

import java.sql.Timestamp;

// regular class is used here instead of @Entity for demo purposes

public class Order {
    private int orderId;
    private int customerId;
    private int amount;
    private Timestamp timestamp;

    public Order(int orderId, int customerId, int amount, Timestamp timestamp) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getAmount() {
        return amount;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
