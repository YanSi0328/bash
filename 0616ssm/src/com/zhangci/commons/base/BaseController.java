package com.zhangci.commons.base;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangci.commons.entity.CodeMsg;
import com.zhangci.commons.entity.Result;
import com.zhangci.commons.entity.TableDataSet;
import com.zhangci.commons.utils.ServletUtil;

import java.util.List;


/**
 * ClassName: BaseController
 * Author: ZhangCi
 *
 * @description: 控制层：向前台输出的信息
 * @date: 2021/6/17 15:24
 * @version: 0.1
 * @since: 1.8
 */
public class BaseController {

    // 分页
    public void startPage() {
        Integer pageNum = ServletUtil.getParameter("pageNum", 1);
        Integer pageSize = ServletUtil.getParameter("pageSize", 2);
        PageHelper.startPage(pageNum, pageSize);
    }

    public Result success(Object data) {
        return Result.success(data);
    }

    public Result success() {
        return Result.success();
    }

    public Result success(CodeMsg cm) {
        return Result.success(cm);
    }

    public Result success(CodeMsg cm, Object data) {
        return Result.success(cm, data);
    }

    public Result error() {
        return Result.error();
    }

    public Result error(CodeMsg cm) {
        return Result.error(cm);
    }

    public Result result(boolean record) {
        if (record) return Result.success();
        else return error();
    }

    public Result getTableData(List list) {
        PageInfo info = new PageInfo(list);
        TableDataSet dataSet = new TableDataSet(info.getPageNum(), info.getPageSize(), info.getTotal(), list);
        return Result.success(dataSet);
    }
}
