package com.zhangci.commons.entity;

import java.util.List;

/**
 * ClassName: TableDatas
 * Author: ZhangCi
 *
 * @description: 含有分页信息的数据集
 * @date: 2021/6/15 20:04
 * @version: 0.1
 * @since: 1.8
 */
public class TableDataSet {
    private Integer page; // 当前页码
    private Integer pageSize; // 当前页面的记录数
    private Long total;  // 当前信息的总记录数
    private List list; // 数据

    public TableDataSet() {
    }

    public TableDataSet(Integer page, Integer pageSize, Long total, List list) {
        this.page = page;
        this.pageSize = pageSize;
        this.total = total;
        this.list = list;
    }

    @Override
    public String toString() {
        return "TableDataSet{" +
                "page=" + page +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", list=" + list +
                '}';
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
