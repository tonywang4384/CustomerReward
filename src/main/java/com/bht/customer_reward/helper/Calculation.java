package com.bht.customer_reward.helper;

public class Calculation {
    public static int calculate(int spent) {
        int reward = 0;
        if (spent >= 0 && spent <= 50)
            return reward;
        else if (spent <= 100) {
            reward = spent - 50;
            return reward;
        }
        else {
            reward = 2 * (spent - 100) + 50;
            return reward;
        }
    }

}
