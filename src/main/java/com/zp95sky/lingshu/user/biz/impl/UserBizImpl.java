package com.zp95sky.lingshu.user.biz.impl;

import com.zp95sky.lingshu.user.biz.UserBiz;
import com.zp95sky.lingshu.user.service.UserService;
import com.zp95sky.lingshu.user.domain.UserDo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 用户业务逻辑实现
 */
@Service
@RequiredArgsConstructor
public class UserBizImpl implements UserBiz {

    private final UserService userService;

    @Override
    public UserDo getCurrentUser() {
        return null;
    }
}