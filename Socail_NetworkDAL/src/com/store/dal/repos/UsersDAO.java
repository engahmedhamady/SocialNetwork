/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.dal.repos;

import com.store.dal.entities.Users;
import com.store.dal.manager.HibernateDBManager;
import com.store.dal.myGenerics.repos.commonDAO;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class UsersDAO implements commonDAO<Users> {

     @Override
    public Users add(Users users) {
         HibernateDBManager.getSession().save(users);
        return users;

    }

    @Override
    public Users  update(Users  users) {
         HibernateDBManager.getSession().update(users);
        return users ;

    }

    @Override
    public void remove(Object name) {
        HibernateDBManager.getSession().delete(name);

    }

    @Override
    public Users  findById(Object ID) {
        return  HibernateDBManager.getSession().get(Users .class, (String) ID);

    }

    @Override
    public List<Users > findList() {
        Session session =  HibernateDBManager.getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Users > CriteriaQuery = builder.createQuery(Users .class);
        Root<Users > from0 = CriteriaQuery.from(Users .class);
        CriteriaQuery.select(from0);
        Query<Users > adminQuery = session.createQuery(CriteriaQuery);
        return adminQuery.getResultList();
    }
 public List<Users > findEmail(String email ) {
        Session session =  HibernateDBManager.getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Users > CriteriaQuery = builder.createQuery(Users .class);
        Root<Users > from0 = CriteriaQuery.from(Users .class);
        CriteriaQuery.select(from0).where(builder.equal(from0.get("user_email"), email));
        Query<Users > adminQuery = session.createQuery(CriteriaQuery);
        return adminQuery.getResultList();
    }

    public void patchRemove(List<Users > users) {
        if (users== null) {

            return;
        }
        for (Users user : users) {
             remove(user.getUserEmail()); 
        }
    }

    public List<Users> findByName(String name) {
        Session session = HibernateDBManager.getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Users> CriteriaQuery = builder.createQuery(Users.class);
        Root<Users> from0 = CriteriaQuery.from(Users.class);
        CriteriaQuery.select(from0).where(builder.equal(from0.get("name"), name));
        org.hibernate.query.Query<Users> adminQuery = session.createQuery(CriteriaQuery);
        return adminQuery.getResultList();

    }
}
