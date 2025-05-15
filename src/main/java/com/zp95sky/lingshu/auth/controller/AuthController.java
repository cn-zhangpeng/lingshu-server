package com.zp95sky.lingshu.auth.controller;

import com.zp95sky.lingshu.auth.biz.AuthBiz;
import com.zp95sky.lingshu.auth.domain.AuthDo;
import com.zp95sky.lingshu.auth.dto.AuthLoginDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthBiz authBiz;

    @PostMapping("/login")
    public AuthDo login(@RequestBody AuthLoginDto loginDto) {
        return authBiz.login(loginDto.getUsername(), loginDto.getPassword());
    }

}