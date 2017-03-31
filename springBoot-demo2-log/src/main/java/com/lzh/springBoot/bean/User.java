package com.lzh.springBoot.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体
 * Created by lzh
 */
public class User implements Serializable {

    /**注册ID*/
    private Integer id;

    /**电话号码*/
    private String phoneNumber;

    /**个性签名*/
    private String signature;

    /**密码*/
    private String password;

    /**用户名*/
    private String userName;

    /**头像*/
    private String avatar;

    /**个人口味*/
    private String personalTaste;

    /**喜欢的菜系*/
    private String likeCuisine;

    /**余额*/
    private Double balance;

    /**积分*/
    private Integer accumulate;

    /** 设备类型 0:android 1:ios*/
    private Integer deviceType;

    /** 设备token */
    private String deviceToken;

    /**请求令牌 token*/
    private String token;

    /**账户是否有效 0:无效 1:有效*/
    private Integer isValid;

    /**注册时间*/
    private Date createTime = new Date();

    /**更新时间*/
    private Date updateTime;

    /**最后登录时间*/
    private Date lastLogin;

    /**所属销售经理*/
    private Integer adminUserId;

    /**备注*/
    private String reMarket;

    /**微信用户的openId*/
    private String openId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(Integer adminUserId) {
        this.adminUserId = adminUserId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPersonalTaste() {
        return personalTaste;
    }

    public void setPersonalTaste(String personalTaste) {
        this.personalTaste = personalTaste;
    }

    public String getLikeCuisine() {
        return likeCuisine;
    }

    public void setLikeCuisine(String likeCuisine) {
        this.likeCuisine = likeCuisine;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getAccumulate() {
        return accumulate;
    }

    public void setAccumulate(Integer accumulate) {
        this.accumulate = accumulate;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getReMarket() {
        return reMarket;
    }

    public void setReMarket(String reMarket) {
        this.reMarket = reMarket;
    }
}
