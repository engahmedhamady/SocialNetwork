/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.dal.repos;

import com.store.dal.entities.UserMessages;
import com.store.dal.manager.HibernateDBManager;
import com.store.dal.myGenerics.repos.commonDAO;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class UserMessagesDAO   implements commonDAO<UserMessages>{

    @Override
    public UserMessages add(UserMessages messages) {
      HibernateDBManager.getSession().save(messages);
        return messages;

    }

    @Override
    public UserMessages update(UserMessages messages) {
         HibernateDBManager.getSession().update(messages);
        return messages;

    }

    @Override
    public void remove(Object name) {
         HibernateDBManager.getSession().delete(name);

    }

    @Override
    public UserMessages findById(Object ID) {
        return  HibernateDBManager.getSession().get(UserMessages.class, (int) ID);

    }

    @Override
    public List<UserMessages> findList() {
        Session session =  HibernateDBManager.getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<UserMessages> CriteriaQuery = builder.createQuery(UserMessages.class);
        Root<UserMessages> from0 = CriteriaQuery.from(UserMessages.class);
        CriteriaQuery.select(from0);
        Query<UserMessages> adminQuery = session.createQuery(CriteriaQuery);
        return adminQuery.getResultList();
    }

    public void patchRemove(List<UserMessages> messageses) {
        if (messageses== null) {

            return;
        }
        for (UserMessages messages : messageses) {
            remove(messages.getId());
        }

    }

    public List<UserMessages> findByName(String name) {
        Session session =  HibernateDBManager.getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<UserMessages> CriteriaQuery = builder.createQuery(UserMessages.class);
        Root<UserMessages> from0 = CriteriaQuery.from(UserMessages.class);
        CriteriaQuery.select(from0).where(builder.equal(from0.get("name"), name));
        org.hibernate.query.Query<UserMessages> adminQuery = session.createQuery(CriteriaQuery);
        return adminQuery.getResultList();

    }
}
