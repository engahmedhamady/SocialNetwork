/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.dal.repos;

import com.store.dal.entities.Posts;
import com.store.dal.manager.HibernateDBManager;
import com.store.dal.myGenerics.repos.commonDAO;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class PostsDAO implements commonDAO<Posts> {

    @Override
    public Posts add(Posts posts) {
        HibernateDBManager.getSession().save(posts);
        return posts;

    }

    @Override
    public Posts update(Posts posts) {
        HibernateDBManager.getSession().update(posts);
        return posts;

    }

    @Override
    public void remove(Object name) {
        HibernateDBManager.getSession().delete(name);

    }

    @Override
    public Posts findById(Object ID) {
        return HibernateDBManager.getSession().get(Posts.class, (int) ID);

    }

    @Override
    public List<Posts> findList() {
        Session session = HibernateDBManager.getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Posts> CriteriaQuery = builder.createQuery(Posts.class);
        Root<Posts> from0 = CriteriaQuery.from(Posts.class);
        CriteriaQuery.select(from0);
        Query<Posts> adminQuery = session.createQuery(CriteriaQuery);
        return adminQuery.getResultList();
    }

    public void patchRemove(List<Posts> postses) {
        if (postses == null) {

            return;
        }
        for (Posts posts : postses) {
            remove(posts.getPostId());
        }

    }

  
    public List<Posts> findByUserEmail(String id) {
        Session session = HibernateDBManager.getSession();
        SQLQuery query = session.createSQLQuery("SELECT * FROM `posts` WHERE `user_email`=?");
        query.setParameter(1, id);
        List<Object[]> rows = query.list();
        List<Posts> posts = new ArrayList<>();
        if (rows != null) {
            for (Object[] row : rows) {
                Posts emp = new Posts();
                emp.setPostId(Integer.parseInt(row[0].toString()));
                emp.setPostContent(row[1].toString());
                emp.setUploadImage(((byte[]) row[2]));
                emp.setPostDate((Date) row[3]);
                emp.setUserEmail(row[4].toString());
                posts.add(emp);
            }
            return posts;
        } else {
            return null;
        }

    }
   

}
