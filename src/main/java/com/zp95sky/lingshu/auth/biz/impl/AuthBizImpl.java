package com.zp95sky.lingshu.auth.biz.impl;

import com.zp95sky.lingshu.auth.biz.AuthBiz;
import com.zp95sky.lingshu.auth.service.AuthService;
import com.zp95sky.lingshu.auth.domain.AuthDo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthBizImpl implements AuthBiz {

    private final AuthService authService;

    @Override
    public AuthDo login(String username, String password) {
        return null;
    }
}