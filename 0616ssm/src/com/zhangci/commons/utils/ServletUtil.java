package com.zhangci.commons.utils;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * ClassName: ServletUtil
 * Author: ZhangCi
 *
 * @description: 工具类：交互对象信息
 * 解决：如何在aop切面中获取session中的登录用户，简化获取servlet对象的代码
 * @date: 2021/6/17 15:02
 * @version: 0.1
 * @since: 1.8
 */
public class ServletUtil {

    /**
     * @return 返回：请求上下文对象
     */
    public static ServletRequestAttributes getRequestAttributes() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes;
    }

    /**
     * @return 返回请求信息
     */
    public static HttpServletRequest getRequest() {
        return getRequestAttributes().getRequest();
    }

    /**
     * @return 返回响应信息
     */
    public static HttpServletResponse getResponse() {
        return getRequestAttributes().getResponse();
    }

    /**
     * @return 返回会话对象
     */
    public static HttpSession getSession() {
        return getRequest().getSession();
    }

    /**
     * @return 返回Servlet上下文
     */
    public static ServletContext getServletContext() {
        return getRequest().getServletContext();
    }

    /**
     * @return 获取 k=v 参数格式的参数值
     */
    public static String getParameter(String name, String defaultValue) {
        String value = getRequest().getParameter(name);
        if (value == null) return defaultValue;
        else return value;
    }

    public static Integer getParameter(String name, Integer defaultValue) {
        String value = getRequest().getParameter(name);
        if (value == null) return defaultValue;
        else return Integer.parseInt(value);
    }

    public static Double getParameter(String name, Double defaultValue) {
        String value = getRequest().getParameter(name);
        if (value == null) return defaultValue;
        else return Double.parseDouble(value);
    }
}
