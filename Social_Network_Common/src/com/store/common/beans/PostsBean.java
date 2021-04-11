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
public class PostsBean {
     private Integer postId;
      private String userEmail;
     private String postContent;
    private byte[] uploadImage;
     private Date postDate;

    public PostsBean() {
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public byte[] getUploadImage() {
        return uploadImage;
    }

    public void setUploadImage(byte[] uploadImage) {
        this.uploadImage = uploadImage;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    

    
}
