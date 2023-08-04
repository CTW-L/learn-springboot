package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class AdminUser implements Serializable {
    /**
     * 用户ID
     *
     * @mbggenerated
     */
    private Short userId;

    /**
     * 用户账号
     *
     * @mbggenerated
     */
    private String accountName;

    /**
     * 真实姓名
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * 密码
     *
     * @mbggenerated
     */
    private String passwd;

    /**
     * 密码盐
     *
     * @mbggenerated
     */
    private String passwdSalt;

    /**
     * 手机号码
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * 用户角色：0-超级管理员|1-管理员|2-开发&测试&运营|3-普通用户（只能查看）
     *
     * @mbggenerated
     */
    private Byte role;

    /**
     * 状态：0-失效|1-有效|2-删除
     *
     * @mbggenerated
     */
    private Byte userStatus;

    /**
     * 创建人ID
     *
     * @mbggenerated
     */
    private Short createBy;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 修改人ID
     *
     * @mbggenerated
     */
    private Short updateBy;

    /**
     * 修改时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Short getUserId() {
        return userId;
    }

    public void setUserId(Short userId) {
        this.userId = userId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPasswdSalt() {
        return passwdSalt;
    }

    public void setPasswdSalt(String passwdSalt) {
        this.passwdSalt = passwdSalt;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }

    public Byte getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    public Short getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Short createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Short updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", accountName=").append(accountName);
        sb.append(", realName=").append(realName);
        sb.append(", passwd=").append(passwd);
        sb.append(", passwdSalt=").append(passwdSalt);
        sb.append(", mobile=").append(mobile);
        sb.append(", role=").append(role);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}