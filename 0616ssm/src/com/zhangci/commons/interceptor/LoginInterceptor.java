package com.zhangci.commons.interceptor;

import com.zhangci.commons.entity.CodeMsg;
import com.zhangci.commons.exception.SelfException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * ClassName: LoginInterceptor
 * Author: ZhangCi
 *
 * @description: 登录拦截器
 * @date: 2021/6/16 20:49
 * @version: 0.1
 * @since: 1.8
 */
public class LoginInterceptor implements HandlerInterceptor {
    // 请求发生前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object loginUser = session.getAttribute("LOGIN_USER");
        if (loginUser == null)
            throw new SelfException(CodeMsg.NO_LOGIN);//返回给前端数据
        return true;
    }

    // 请求完成后
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    // 整个请求完成之后
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
