package com.zhangci.commons.entity;

/**
 * ClassName: Code
 * Author: ZhangCi
 *
 * @description: 封装返回前端的编码和操作结果信息
 * @date: 2021/6/15 19:58
 * @version: 0.1
 * @since: 1.8
 */
public enum CodeMsg {
    SUCCESS(2000, "成功"),
    ERROR(4000, "失败"),
    NO_LOGIN(4001, "未登录"),
    NO_AUTHORITY(4002, "未授权"),
    PWD_ERROR(4003, "密码错误"),
    BY_ZERO(4004, "除数为0"),
    NO_USER(4005, "未注册"),
    UPLOAD_FAILED(4006,"文件上传失败"),;

    private Integer code;
    private String msg;

    CodeMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
