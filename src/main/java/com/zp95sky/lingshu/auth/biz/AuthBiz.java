package com.zp95sky.lingshu.auth.biz;

import com.zp95sky.lingshu.auth.domain.AuthDo;

public interface AuthBiz {

    AuthDo login(String username, String password);

}