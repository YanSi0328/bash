package com.zhangci.commons.base;

import com.zhangci.commons.utils.CurrentUserUtil;
import com.zhangci.commons.utils.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * ClassName: BaseServiceImpl
 * Author: ZhangCi
 *
 * @description:
 * @date: 2021/6/17 15:52
 * @version: 0.1
 * @since: 1.8
 */
public class BaseServiceImpl<D extends BaseDao<T>, T extends BaseEntity> implements BaseService<T> {

    // 对于参数化类型的注入不能使用@Resource注解
    @Autowired
    protected D baseDao;


    @Override
    public T queryById(String id) {
        return baseDao.queryById(id);
    }

    @Override
    public List<T> queryAll(T t) {
        return baseDao.queryAll(t);
    }

    @Override
    public boolean add(T t) {
        t.setCreateBy(CurrentUserUtil.getUserName());
        t.setCreateTime(DataUtil.getCurrentSysTime());
        t.setUpdateTime(DataUtil.getCurrentSysTime());
        int record = baseDao.add(t);
        return record == 1 ? true : false;
    }

    @Override
    public boolean updateById(T t) {
        t.setUpdateBy(CurrentUserUtil.getUserName());
        t.setUpdateTime(DataUtil.getCurrentSysTime());
        int record = baseDao.updateById(t);
        return record == 1 ? true : false;
    }

    @Override
    public boolean delById(String id) {
        int record = baseDao.delById(id);
        return record == 1 ? true : false;
    }

    @Override
    public boolean delByIds(List<String> ids) {
        int record = baseDao.delByIds(ids);
        return record > 0 ? true : false;
    }

    public D getBaseDao() {
        return baseDao;
    }

    public void setBaseDao(D baseDao) {
        this.baseDao = baseDao;
    }
}
