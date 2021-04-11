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
public class UserMessagesBean {
     private Integer id;
     private int userTo;
     private int userFrom;
     private String msgBody;
     private Date date;
     private String msgSeen;
 private String userEmail;
    public UserMessagesBean() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserTo() {
        return userTo;
    }

    public void setUserTo(int userTo) {
        this.userTo = userTo;
    }

    public int getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(int userFrom) {
        this.userFrom = userFrom;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMsgSeen() {
        return msgSeen;
    }

    public void setMsgSeen(String msgSeen) {
        this.msgSeen = msgSeen;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
     
}
