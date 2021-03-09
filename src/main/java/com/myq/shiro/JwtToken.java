package com.myq.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author 孟赟强
 * @date 2021/1/12-2:42
 */
public class JwtToken implements AuthenticationToken {
    private String token;
    public JwtToken(String token) {
        this.token = token;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }
    @Override
    public Object getCredentials() {
        return token;
    }
}

