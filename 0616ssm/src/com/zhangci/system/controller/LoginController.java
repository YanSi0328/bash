package com.zhangci.system.controller;

import com.zhangci.commons.entity.Result;
import com.zhangci.commons.utils.CurrentUserUtil;
import com.zhangci.system.entity.SysUser;
import com.zhangci.system.service.SysUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName: LoginController
 * Author: ZhangCi
 *
 * @description: 跨域、中文乱码、数据库乱码
 * @date: 2021/6/17 19:33
 * @version: 0.1
 * @since: 1.8
 */
@RestController
@RequestMapping("login")
public class LoginController {

    @Resource
    private SysUserService userService;

    @PostMapping
    public Result doLogin(String uName, String uPwd) {
        // k=v 的形式：会出现中文乱码(不加@RequestBody )
        // 如果这个方法能够拿到登录用户和密码，说明可以跨域，可以进行前后端的开发
        System.out.println(" 执行 -> doLogin");
        System.out.println(" 登录用户 -> " + uName);
        System.out.println(" 用户密码 -> " + uPwd);
        // 登录过滤器问题
        CurrentUserUtil.setLoginUser(new SysUser("zc","123"));



        // 尝试将数据放入数据库看是否会出现数据中文乱码 -> 无乱码
//        boolean add = userService.add(new SysUser(uName, uPwd));
        return Result.success();
    }
}