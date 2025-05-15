package com.zp95sky.lingshu.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zp95sky.lingshu.user.entity.User;

/**
 * 用户服务接口
 */
public interface UserService extends IService<User> {

    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return 用户信息
     */
    User getByUsername(String username);
}