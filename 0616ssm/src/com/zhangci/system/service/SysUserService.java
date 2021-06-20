package com.zhangci.system.service;

import com.zhangci.system.entity.SysUser;
import com.zhangci.commons.base.BaseService;

public interface SysUserService extends BaseService<SysUser> {

    /**
     * 新增批量新增用户
     * @param sysUser 用户数组
     * @return 执行结果
     */
    boolean addUsers(SysUser[] sysUser);

}
