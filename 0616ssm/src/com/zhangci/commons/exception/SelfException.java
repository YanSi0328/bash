package com.zhangci.commons.exception;

import com.zhangci.commons.entity.CodeMsg;

/**
 * ClassName: SelfException
 * Author: ZhangCi
 *
 * @description:
 * @date: 2021/6/16 20:50
 * @version: 0.1
 * @since: 1.8
 */
public class SelfException extends RuntimeException {

    private CodeMsg codeMsg;

    public SelfException(CodeMsg codeMsg) {
        this.codeMsg = codeMsg;
    }

    public CodeMsg getCodeAndMsg() {
        return codeMsg;
    }

    public void setCodeAndMsg(CodeMsg codeMsg) {
        this.codeMsg = codeMsg;
    }
}
