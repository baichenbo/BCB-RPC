package com.bcb.example.consumer;

import com.bcb.bcbrpc.proxy.ServiceProxyFactory;
import com.bcb.example.common.model.User;
import com.bcb.example.common.service.UserService;

public class EasyConsumerExample {
    public static void main(String[] args) {
        //使用静态代理
        UserService userService = new UserServiceProxy();
        User user = new User();
        user.setName("bcb");
        System.out.println("静态代理：" + userService.getUser(user).getName());

        //使用动态代理
        UserService userService2 = ServiceProxyFactory.getProxy(UserService.class);
        System.out.println("动态代理：" + userService2.getUser(user).getName());
    }
}
