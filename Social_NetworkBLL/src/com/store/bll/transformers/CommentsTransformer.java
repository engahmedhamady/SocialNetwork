package com.store.bll.transformers;

import com.store.common.beans.CommentsBean;
import com.store.dal.entities.Comments;

public class CommentsTransformer {

    public CommentsBean transformEntityToBean(Comments entity) {
        if (entity == null) {
            return null;
        }
        CommentsBean bean = new CommentsBean();
        // transform
        bean.setComId(entity.getComId());
        bean.setComment(entity.getComment());
        bean.setCommentAuthor(entity.getCommentAuthor());
        bean.setDate(entity.getDate());
        bean.setPostId(entity.getPostId());
        
        return bean;
    }

    public Comments transformBeanToEntity(CommentsBean bean) {
        if (bean == null) {
            return null;
        }
        Comments entity = new Comments();
        // transform
        entity.setComId(bean.getComId());
        entity.setComment(bean.getComment());
        entity.setCommentAuthor(bean.getCommentAuthor());
        entity.setDate(bean.getDate());
        entity.setPostId(bean.getPostId());
        
        return entity;
    }
}
