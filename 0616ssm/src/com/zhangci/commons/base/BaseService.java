package com.zhangci.commons.base;

import java.util.List;

/**
 * ClassName: BaseService
 * Author: ZhangCi
 *
 * @description: 抽象公共类(业务逻辑层)：对业务逻辑层的一些基本操作进行抽象出来
 * @date: 2021/6/17 11:58
 * @version: 0.1
 * @since: 1.8
 */
public interface BaseService<S> {
    /**
     * 根据id查询单条记录
     *
     * @param id 执行id
     * @return 查询到的实例对象
     */
    S queryById(String id);

    /**
     * 查询全部的信息，分页条件另加
     *
     * @param s 传递过来的实例对象
     * @return 查询到实例对象的集合
     */
    List<S> queryAll(S s);

    /**
     * 新增单条记录
     *
     * @param s 传递过来的实例对象
     * @return 操作结果
     */
    boolean add(S s);

    /**
     * 修改记录
     *
     * @param s 传递过来的实例对象
     * @return 操作结果
     */
    boolean updateById(S s);

    /**
     * 根据id删除指定记录
     *
     * @param id 指定id
     * @return 操作结果
     */
    boolean delById(String id);

    /**
     * 根据数组id批量删除记录
     *
     * @param ids 待删除的数组id
     * @return 操作结果
     */
    boolean delByIds(List<String> ids);

}
