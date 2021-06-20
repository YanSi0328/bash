package com.zhangci.system.service.impl;

import com.zhangci.system.entity.SysUser;
import com.zhangci.system.dao.SysUserDao;
import com.zhangci.system.service.SysUserService;
import org.springframework.stereotype.Service;

import com.zhangci.commons.base.BaseServiceImpl;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("sysUserService")
public class SysUserServiceImpl extends BaseServiceImpl<SysUserDao, SysUser> implements SysUserService {

    @Resource
    private SysUserDao userDao;

    @Transactional
    @Override
    public boolean addUsers(SysUser[] sysUser) {
        for (SysUser user : sysUser) {
            userDao.add(user);
        }
        return true;
    }
}
