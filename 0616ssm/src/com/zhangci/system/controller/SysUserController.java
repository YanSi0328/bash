package com.zhangci.system.controller;

import com.zhangci.system.entity.SysUser;
import com.zhangci.system.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import com.zhangci.commons.base.BaseController;
import com.zhangci.commons.entity.Result;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("sysUser")
public class SysUserController extends BaseController {

    @Resource
    private SysUserService sysUserService;

    @GetMapping("{id}")
    public Result selectById(@PathVariable("id") String id) {
        SysUser obj = this.sysUserService.queryById(id);
        return success(obj);
    }

    @GetMapping("list")
    public Result selectList(SysUser obj) {
        startPage();
        List<SysUser> list = this.sysUserService.queryAll(obj);
        return getTableData(list);
    }

    @PostMapping
    public Result add(@RequestBody SysUser obj) {
        boolean record = this.sysUserService.add(obj);
        return result(record);
    }

    @PutMapping
    public Result update(@RequestBody SysUser obj) {
        boolean record = this.sysUserService.updateById(obj);
        return result(record);
    }

    @DeleteMapping("{ids}")
    public Result delById(@PathVariable("ids") String ids) {
        String[] split = ids.split(",");
        boolean record = this.sysUserService.delByIds(Arrays.asList(split));
        return result(record);
    }
}
