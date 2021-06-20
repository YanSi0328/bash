package com.zhangci.commons.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * ClassName: SpringUtil
 * Author: ZhangCi
 *
 * @description: 工具类：拿到容器的使用，便于在static方法或者子线程中获取容器中的bean对象
 * 即如何在一个为注册到容器的类中使用容器中的bean
 * @date: 2021/6/17 14:30
 * @version: 0.1
 * @since: 1.8
 */
@Component
public class SpringUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        applicationContext = ac;
    }

    /**
     * @return 父容器的ApplicationContext
     */
    public static ApplicationContext getParenApplicationContext() {
        return applicationContext;
    }

    /**
     * @param tClass 待获取的bean
     * @param <T>    泛型
     * @return 容器中本类的bean对象
     */
    public static <T> T getBean(Class<T> tClass) {
        return applicationContext.getBean(tClass);
    }

    public static Object getBean(String beanId) {
        return applicationContext.getBean(beanId);
    }

    public static <T> T getBean(String beanId, Class<T> tClass) {
        return applicationContext.getBean(beanId, tClass);
    }
}
