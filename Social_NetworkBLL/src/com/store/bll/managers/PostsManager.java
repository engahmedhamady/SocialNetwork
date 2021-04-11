/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.bll.managers;


import com.store.common.beans.PostsBean;
import com.store.dal.entities.Posts;
import java.util.List;


public interface PostsManager {
   
 public abstract List<PostsBean> findbyUserEmail(String email);
  public  abstract PostsBean insert (PostsBean postsBean);
      public abstract PostsBean  removePost(int postId);
  public  abstract List< PostsBean >listAll ();
  public  abstract List< PostsBean >findbyUserID ();
 
   
}
