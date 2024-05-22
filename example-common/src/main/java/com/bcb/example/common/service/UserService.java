package com.bcb.example.common.service;

import com.bcb.example.common.model.User;

public interface UserService {
    /**
     * 获取用户
     *
     * @param user
     * @return
     */
    User getUser(User user);

    /**
     * 测试 Mock，获取一个数字
     */
    default short getNumber() {
        return 2;
    }
}
