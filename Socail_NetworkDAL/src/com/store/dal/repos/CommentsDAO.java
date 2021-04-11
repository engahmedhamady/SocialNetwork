/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.dal.repos;

import com.store.dal.entities.Comments;
import com.store.dal.manager.HibernateDBManager;
import com.store.dal.myGenerics.repos.commonDAO;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.query.Query;


public class CommentsDAO implements commonDAO<Comments>{

   @Override
    public Comments add(Comments comments) {
           HibernateDBManager.getSession().save(comments);
        return comments;

    }

    @Override
    public Comments update(Comments comments) {
      HibernateDBManager.getSession().update(comments);
        return comments;

    }

    @Override
    public void remove(Object name) {
       HibernateDBManager.getSession().delete(name);

    }

    @Override
    public Comments findById(Object ID) {
        return HibernateDBManager.getSession().get(Comments.class, (int) ID);

    }

    @Override
    public List<Comments> findList() {
        Session session =  HibernateDBManager.getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Comments> CriteriaQuery = builder.createQuery(Comments.class);
        Root<Comments> from0 = CriteriaQuery.from(Comments.class);
        CriteriaQuery.select(from0);
        Query<Comments> adminQuery = session.createQuery(CriteriaQuery);
        return adminQuery.getResultList();
    }

    public void patchRemove(List<Comments> commentses) {
        if (commentses == null) {

            return;
        }
        for (Comments c : commentses) {
            remove(c.getComId());
        }

    }

    public List<Comments> findByName(String name) {
        Session session =  HibernateDBManager.getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Comments> CriteriaQuery = builder.createQuery(Comments.class);
        Root<Comments> from0 = CriteriaQuery.from(Comments.class);
        CriteriaQuery.select(from0).where(builder.equal(from0.get("name"), name));
        org.hibernate.query.Query<Comments> adminQuery = session.createQuery(CriteriaQuery);
        return adminQuery.getResultList();

    }
}
