package com.zp95sky.lingshu.user.biz;

import com.zp95sky.lingshu.user.domain.UserDo;

/**
 * 用户业务逻辑接口
 */
public interface UserBiz {
    UserDo getCurrentUser();
}