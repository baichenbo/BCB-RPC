package com.bcb.example.consumer;

import com.bcb.example.common.model.User;
import com.bcb.example.common.service.UserService;

public class EasyConsumerExample {
    public static void main(String[] args) {
        UserService userService = new UserServiceProxy();
        User user = new User();
        user.setName("bcb");
        System.out.println(userService.getUser(user));
    }
}
