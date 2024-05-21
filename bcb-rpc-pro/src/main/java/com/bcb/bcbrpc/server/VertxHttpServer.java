package com.bcb.bcbrpc.server;

import io.vertx.core.Vertx;

public class VertxHttpServer implements HttpServer{
    /**
     * 启动服务器
     * @param port
     */
    public void doStart(int port) {
        //创建Vert.x实例
        Vertx vertx = Vertx.vertx();

        //创建 HTTP 服务器
        io.vertx.core.http.HttpServer httpServer = vertx.createHttpServer();

        //监听端口并处理请求
        httpServer.requestHandler(new HttpServerHandler());

        //启动HTTP服务器并监听指定端口
        httpServer.listen(port, result->{
           if(result.succeeded()){
               System.out.println("服务器正在监听端口："+port);
           }else{
               System.out.println("未能打开服务器："+result.cause());
           }
        });


    }
}
