/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.common.beans;

import java.util.Date;

/**
 *
 * @author Sroor For Laptop
 */
public class UsersBean {

    private String FName;
    private String LName;
    private String userName;
    private String describeUser;
    private String relationship;
    private String userPassword;
    private String userEmail;
    private String userCountry;
    private String userGendre;
    private String userBirthday;
    private byte[] userImage;
    private byte[] userCover;
    private Date userRegDate;
    private String status;
    private String posts;
    private String recoveryAccount;
    private String isLegalLogin;

    public UsersBean() {
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescribeUser() {
        return describeUser;
    }

    public void setDescribeUser(String describeUser) {
        this.describeUser = describeUser;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserGendre() {
        return userGendre;
    }

    public void setUserGendre(String userGendre) {
        this.userGendre = userGendre;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public byte[] getUserImage() {
        return userImage;
    }

    public void setUserImage(byte[] userImage) {
        this.userImage = userImage;
    }

    public byte[] getUserCover() {
        return userCover;
    }

    public void setUserCover(byte[] userCover) {
        this.userCover = userCover;
    }

    public Date getUserRegDate() {
        return userRegDate;
    }

    public void setUserRegDate(Date userRegDate) {
        this.userRegDate = userRegDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public String getRecoveryAccount() {
        return recoveryAccount;
    }

    public void setRecoveryAccount(String recoveryAccount) {
        this.recoveryAccount = recoveryAccount;
    }

    public String getIsLegalLogin() {
        return isLegalLogin;
    }

    public void setIsLegalLogin(String isLegalLogin) {
        this.isLegalLogin = isLegalLogin;
    }

   

}
