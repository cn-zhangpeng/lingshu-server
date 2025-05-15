package com.zp95sky.lingshu.auth.domain;

import lombok.Data;

@Data
public class AuthDo {

    private String username;
    private String password;
    private String token;

}
