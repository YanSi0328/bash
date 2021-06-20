package com.zhangci.system.user;

import com.zhangci.system.entity.SysUser;
import com.zhangci.system.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * ClassName: TestUser
 * Author: ZhangCi
 *
 * @description:
 * @date: 2021/6/17 9:41
 * @version: 0.1
 * @since: 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestUser {

    @Resource
    private SysUserService userService;

    @Test
    public void test1_queryById(){
        SysUser sysUser = userService.queryById(String.valueOf(1));
        System.out.println(sysUser);
    }

    @Test
    public void test2_addUsers(){
        // 测试事务处理 -> 正常
        SysUser user1 = new SysUser("zhangci1", "10200");
        SysUser user2 = new SysUser("zhangci2", "200300333333333333333333333333333");
        userService.addUsers(new SysUser[]{user1,user2});
    }
}
