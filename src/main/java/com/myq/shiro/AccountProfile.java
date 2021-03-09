package com.myq.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 孟赟强
 * @date 2021/1/14-15:36
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;
    private String username;
    private String avatar;
}

