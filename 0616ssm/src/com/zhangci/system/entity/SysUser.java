package com.zhangci.system.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zhangci.commons.base.BaseEntity;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2021-06-17 16:52:41
 */
// 加完注解仅返回不为空的字段值
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SysUser extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 914414721009988367L;

    private Integer userId;
    private Integer roleId;
    private String userName;
    private String userHeadImg;
    private String userPwd;
    private Integer userPhone;
    private String userEmail;
    private String userAddress;
    private Integer loginStatus;

    // 用于测试事务是否可行
    public SysUser(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }

    public SysUser() {
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                ", userName='" + userName + '\'' +
                ", userHeadImg='" + userHeadImg + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userPhone=" + userPhone +
                ", userEmail='" + userEmail + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", loginStatus=" + loginStatus +
                '}';
    }

    public SysUser(String createTime, String updateTime, String createBy, String updateBy, Integer deleteFlag, Integer userId, Integer roleId, String userName, String userHeadImg, String userPwd, Integer userPhone, String userEmail, String userAddress, Integer loginStatus) {
        super(createTime, updateTime, createBy, updateBy, deleteFlag);
        this.userId = userId;
        this.roleId = roleId;
        this.userName = userName;
        this.userHeadImg = userHeadImg;
        this.userPwd = userPwd;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.loginStatus = loginStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserHeadImg() {
        return userHeadImg;
    }

    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

}
