package com.store.bll.transformers;

import com.store.common.beans.UserMessagesBean;
import com.store.dal.entities.UserMessages;

public class UserMessagesTransformer {

    public UserMessagesBean transformEntityToBean(UserMessages entity) {
        if (entity == null) {
            return null;
        }
        UserMessagesBean bean = new UserMessagesBean();
        // transform
        bean.setDate(entity.getDate());
        bean.setId(entity.getId());
        bean.setMsgBody(entity.getMsgBody());
        bean.setMsgSeen(entity.getMsgSeen());
        bean.setUserFrom(entity.getUserFrom());
        bean.setUserTo(entity.getUserTo());
         bean.setUserEmail(entity.getUserEmail()); 
        return bean;
    }

    public UserMessages transformBeanToEntity(UserMessagesBean bean) {
        if (bean == null) {
            return null;
        }
        UserMessages entity = new UserMessages();
        // transform
        entity.setDate(bean.getDate());
        entity.setId(bean.getId());
        entity.setMsgBody(bean.getMsgBody());
        entity.setMsgSeen(bean.getMsgSeen());
        entity.setUserFrom(bean.getUserFrom());
        entity.setUserTo(bean.getUserTo());
         entity.setUserEmail(bean.getUserEmail());
        return entity;
    }
}
