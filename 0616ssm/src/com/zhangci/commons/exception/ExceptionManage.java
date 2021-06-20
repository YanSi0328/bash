package com.zhangci.commons.exception;

import com.zhangci.commons.entity.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * ClassName: ExceptionManage
 * Author: ZhangCi
 *
 * @description: 全局异常处理
 * @date: 2021/6/17 10:32
 * @version: 0.1
 * @since: 1.8
 */
@RestControllerAdvice
public class ExceptionManage {
    // 默认异常的处理
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e) {
        e.printStackTrace();
        return Result.error();
    }

    // 自定义异常的处理
    @ExceptionHandler(SelfException.class)
    public Result doSelfException(SelfException e) {
        e.printStackTrace();
        return Result.error(e.getCodeAndMsg());
    }
}
