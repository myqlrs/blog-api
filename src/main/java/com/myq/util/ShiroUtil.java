package com.myq.util;

import com.myq.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author 孟赟强
 * @date 2021/1/14-21:00
 */
public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }

}
