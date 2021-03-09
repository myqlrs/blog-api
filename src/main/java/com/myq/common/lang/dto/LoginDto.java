package com.myq.common.lang.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author 孟赟强
 * @date 2021/1/14-20:36
 */
@Data
public class LoginDto implements Serializable {

    @NotBlank(message = "昵称不能为空!")
    private String username;

    @NotBlank(message = "密码不能为空!")
    private String password;
}
