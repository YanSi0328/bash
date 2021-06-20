package com.zhangci.commons.utils;

import com.zhangci.system.entity.SysUser;

/**
 * ClassName: CurrentUserUtil
 * Author: ZhangCi
 *
 * @description: 工具类：当前系统的登录用户
 * @date: 2021/6/17 15:02
 * @version: 0.1
 * @since: 1.8
 */
public class CurrentUserUtil {
    /**
     * 将当前用户放入session当中
     */
    public static void setLoginUser(SysUser sysUser) {
        ServletUtil.getSession().setAttribute("LOGIN_USER", sysUser);
    }

    /**
     * @return 当前系统登录的用户
     */
    public static SysUser getLoginUser() {
        Object loginUser = ServletUtil.getSession().getAttribute("LOGIN_USER");
        if (loginUser != null) return (SysUser) loginUser;
        return null;
    }

    /**
     * @return 返回当前系统用户的用户名
     */
    public static String getUserName() {
        return "zc";
//        return getLoginUser().getUserName();
    }
}
