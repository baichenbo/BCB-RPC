package com.bcb.example.consumer;

import com.bcb.bcbrpc.config.RpcConfig;
import com.bcb.bcbrpc.proxy.ServiceProxyFactory;
import com.bcb.bcbrpc.utils.ConfigUtils;
import com.bcb.example.common.model.User;
import com.bcb.example.common.service.UserService;

/**
 * 消费者实例，测试配置文件的读取
 */
public class ConsumerExample {

    public static void main(String[] args) {
//        RpcConfig rpcConfig = ConfigUtils.loadConfig(RpcConfig.class,"rpc");
//        System.out.println(rpcConfig);
        // 获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("bcb");
        //调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
        int num = userService.getNumber();
        System.out.println(num);
    }
}
