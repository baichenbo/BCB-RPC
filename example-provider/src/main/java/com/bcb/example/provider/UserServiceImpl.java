package com.bcb.example.provider;

import com.bcb.example.common.model.User;
import com.bcb.example.common.service.UserService;

public class UserServiceImpl implements UserService {

    public User getUser(User user) {
        System.out.println("用户名" + user.getName());
        return user;
    }
}
