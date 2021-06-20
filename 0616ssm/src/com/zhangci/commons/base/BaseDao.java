package com.zhangci.commons.base;


import java.util.List;

/**
 * ClassName: BaseDao
 * Author: ZhangCi
 *
 * @description: 抽象公共类：dao接口层，只含有单表的CRUD操作
 * @date: 2021/6/17 11:56
 * @version: 0.1
 * @since: 1.8
 */
public interface BaseDao<T> {

    /**
     * 根据id查询单条记录
     *
     * @param id 记录id
     * @return 查询到的实例对象
     */
    T queryById(String id);

    /**
     * 查询全部的信息，分页条件另加
     *
     * @param t 传递过来的实例对象
     * @return 查询到实例对象的集合
     */
    List<T> queryAll(T t);

    /**
     * 新增单条记录
     *
     * @param t 传递过来的实例对象
     * @return 受影响的数据库记录数
     */
    int add(T t);

    /**
     * 修改记录
     *
     * @param t 传递过来的实例对象
     * @return 受影响的数据库记录数
     */
    int updateById(T t);

    /**
     * 根据id删除指定记录
     *
     * @param id 指定id
     * @return 受影响的数据库记录数
     */
    int delById(String id);

    /**
     * 根据数组id批量删除记录
     * @param ids 待删除的数组id
     * @return 受影响的数据库记录数
     */
    int delByIds(List<String> ids);
}
