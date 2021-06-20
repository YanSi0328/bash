package com.zhangci.commons.base;

/**
 * ClassName: BaseEntity
 * Author: ZhangCi
 *
 * @description: 抽象公共类：对实体中的一些公共字段进行管理
 * @date: 2021/6/17 11:58
 * @version: 0.1
 * @since: 1.8
 */
public class BaseEntity {
    private String createTime; // 该记录的创建时间
    private String updateTime; // 该记录的最近的修改时间
    private String createBy;   // 该记录的创建人
    private String updateBy;   // 该记录的修改人
    private Integer deleteFlag;   // 删除标记位：进行该记录的逻辑删除

    public BaseEntity() {
    }

    public BaseEntity(String createTime, String updateTime, String createBy, String updateBy, Integer deleteFlag) {
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", deleteFlag=" + deleteFlag +
                '}';
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
