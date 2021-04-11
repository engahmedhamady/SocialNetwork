package com.store.bll.transformers;

import com.store.common.beans.UsersBean;
import com.store.dal.entities.Users;

public class UsersTransformer {

    public UsersBean transformEntityToBean(Users entity) {
        if (entity == null) {
            return null;
        }
        UsersBean bean = new UsersBean();
        // transform
        bean.setDescribeUser(entity.getDescribeUser());
        bean.setFName(entity.getFName());
        bean.setLName(entity.getLName());
        bean.setPosts(entity.getPosts());
        bean.setRecoveryAccount(entity.getRecoveryAccount());
        bean.setRelationship(entity.getRelationship());
        bean.setStatus(entity.getStatus());
        bean.setUserBirthday(entity.getUserBirthday());
        bean.setUserCountry(entity.getUserCountry());
        bean.setUserCover(entity.getUserCover());
        bean.setUserEmail(entity.getUserEmail());
        bean.setUserGendre(entity.getUserGendre());
        
        bean.setUserImage(entity.getUserImage());
        bean.setUserName(entity.getUserName());
        bean.setUserPassword(entity.getUserPassword());
        bean.setUserRegDate(entity.getUserRegDate());

        return bean;
    }

    public Users transformBeanToEntity(UsersBean bean) {
        if (bean == null) {
            return null;
        }
        Users entity = new Users();
        // transform
        entity.setDescribeUser(bean.getDescribeUser());
        entity.setFName(bean.getFName());
        entity.setLName(bean.getLName());
        entity.setPosts(bean.getPosts());
        entity.setRecoveryAccount(bean.getRecoveryAccount());
        entity.setRelationship(bean.getRelationship());
        entity.setStatus(bean.getStatus());
        entity.setUserBirthday(bean.getUserBirthday());
        entity.setUserCountry(bean.getUserCountry());
        entity.setUserCover(bean.getUserCover());
        entity.setUserEmail(bean.getUserEmail());
        entity.setUserGendre(bean.getUserGendre());
      
        entity.setUserImage(bean.getUserImage());
        entity.setUserName(bean.getUserName());
        entity.setUserPassword(bean.getUserPassword());
        entity.setUserRegDate(bean.getUserRegDate());

        return entity;
    }
}
