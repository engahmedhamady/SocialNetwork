package com.store.bll.transformers;


import com.store.common.beans.PostsBean;
import com.store.dal.entities.Posts;

public class PostsTransformer {

   
    public PostsBean transformEntityToBean(Posts entity) {
        if (entity == null) {
            return null;
        }
        PostsBean bean = new PostsBean();
        // transform
        bean.setPostContent(entity.getPostContent());
        bean.setPostDate(entity.getPostDate());
        bean.setPostId(entity.getPostId());
         bean.setUploadImage(entity.getUploadImage());
        bean.setUserEmail(entity.getUserEmail());
        return bean;
    }

    public Posts transformBeanToEntity(PostsBean bean) {
        if (bean == null) {
            return null;
        }
        Posts entity = new Posts();
        // transform
          entity.setPostContent(bean.getPostContent());
         entity.setPostDate(bean.getPostDate());
        entity.setPostId(bean.getPostId());
          entity.setUploadImage(bean.getUploadImage());
        entity.setUserEmail(bean.getUserEmail());
        return entity;
    }
}
