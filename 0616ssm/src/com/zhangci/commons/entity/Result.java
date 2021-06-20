package com.zhangci.commons.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * ClassName: Result
 * Author: ZhangCi
 *
 * @description: 封装返回到前端的对象
 * @date: 2021/6/15 19:57
 * @version: 0.1
 * @since: 1.8
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {
    private Integer code; // 返回的编号
    private String msg;   // 编号对应的信息
    private Object data;  // 待返回的数据

    // 封装全部信息
    public Result(CodeMsg cm, Object data) {
        this.code = cm.getCode();
        this.msg = cm.getMsg();
        this.data = data;
    }

    // 仅封装编号和信息
    public Result(CodeMsg cm) {
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

    // 仅封装数据
    public Result(Object data) {
        this(CodeMsg.SUCCESS, data);
    }

    // 成功：默认返回操作成功、指定返回码、指定数据、指定全部信息
    public static Result success() {
        return new Result(CodeMsg.SUCCESS);
    }

    public static Result success(CodeMsg cm) {
        return new Result(cm);
    }

    public static Result success(Object data) {
        return new Result(data);
    }

    public static Result success(CodeMsg cm, Object data) {
        return new Result(cm, data);
    }

    //  错误操作
    public static Result error(CodeMsg cm) {
        return new Result(cm);
    }

    public static Result error() {
        return new Result(CodeMsg.ERROR);
    }

    public static Result error(CodeMsg cm, Object data) {
        return new Result(cm, data);
    }

    public static Result error(Object data) {
        return new Result(CodeMsg.ERROR, data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
