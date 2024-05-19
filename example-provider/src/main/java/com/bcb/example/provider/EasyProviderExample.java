package com.bcb.example.provider;


import com.bcb.bcbrpc.registry.LocalRegistry;
import com.bcb.bcbrpc.server.HttpServer;
import com.bcb.bcbrpc.server.VertxHttpServer;
import com.bcb.example.common.service.UserService;

public class EasyProviderExample {

    public static void main(String[] args) {
        //注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        //启动web服务器
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
