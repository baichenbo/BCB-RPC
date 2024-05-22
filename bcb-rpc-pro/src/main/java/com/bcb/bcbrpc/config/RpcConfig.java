package com.bcb.bcbrpc.config;

import lombok.Data;

@Data
public class RpcConfig {

    /**
     * 名字
     */
    private String name = "bcb-rpc";

    /**
     * 版本号
     */
    private String version = "1.0";

    /**
     * 服务器主机名
     */
    private String serverHost = "localhost";

    /**
     * 服务器端口号
     */
    private Integer port = 8080;

    /**
     * 模拟调用
     */
    private boolean mock = false;
}
