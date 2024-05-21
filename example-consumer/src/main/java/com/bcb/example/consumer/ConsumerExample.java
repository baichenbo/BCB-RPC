package com.bcb.example.consumer;

import com.bcb.bcbrpc.config.RpcConfig;
import com.bcb.bcbrpc.utils.ConfigUtils;

/**
 * 消费者实例，测试配置文件的读取
 */
public class ConsumerExample {

    public static void main(String[] args) {
        RpcConfig rpcConfig = ConfigUtils.loadConfig(RpcConfig.class,"rpc");
        System.out.println(rpcConfig);
    }
}
