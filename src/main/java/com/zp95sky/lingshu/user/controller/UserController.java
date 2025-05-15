package com.zp95sky.lingshu.user.controller;

import com.zp95sky.lingshu.user.biz.UserBiz;
import com.zp95sky.lingshu.user.domain.UserDo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserBiz userBiz;

    @GetMapping("/current")
    public UserDo getCurrentUser() {
        return userBiz.getCurrentUser();
    }

}