package com.bcb.example.provider;

import com.bcb.bcbrpc.RpcApplication;
import com.bcb.bcbrpc.registry.LocalRegistry;
import com.bcb.bcbrpc.server.HttpServer;
import com.bcb.bcbrpc.server.VertxHttpServer;
import com.bcb.example.common.service.UserService;

/**
 * 简单服务提供者示例
 */
public class ProviderExample {

    public static void main(String[] args) {
        // RPC 框架初始化
        RpcApplication.init();

        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动Web服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(RpcApplication.getRpcConfig().getPort());
    }
}
