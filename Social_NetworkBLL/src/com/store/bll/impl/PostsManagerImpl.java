/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.bll.impl;

import com.store.bll.managers.PostsManager;
import com.store.bll.transformers.PostsTransformer;
import com.store.common.beans.PostsBean;
import com.store.dal.entities.Posts;
import com.store.dal.manager.HibernateDBManager;
import com.store.dal.repos.PostsDAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

public class PostsManagerImpl implements PostsManager {

    @Override
    public PostsBean insert(PostsBean postsBean) {
        try {
            HibernateDBManager.setDbConfigFileName("com/store/dal/config/hibernate.cfg.xml");
            HibernateDBManager.buildSessionFactory();
            Session session = HibernateDBManager.getSession();
            HibernateDBManager.beginTransaction();
            PostsTransformer postsTransformer = new PostsTransformer();
            PostsDAO dAO = new PostsDAO();
            Posts add = dAO.add(postsTransformer.transformBeanToEntity(postsBean));
            HibernateDBManager.commitTransaction();
            HibernateDBManager.closeSession();
            if (add == null) {
                return null;
            } else {
                return postsTransformer.transformEntityToBean(add);
            }
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public List<PostsBean> listAll() {
        try {
            HibernateDBManager.setDbConfigFileName("com/store/dal/config/hibernate.cfg.xml");
            HibernateDBManager.buildSessionFactory();
            Session session = HibernateDBManager.getSession();
            HibernateDBManager.beginTransaction();
            PostsDAO dAO = new PostsDAO();
            PostsTransformer postsTransformer = new PostsTransformer();
            List<Posts> findList = dAO.findList();
            HibernateDBManager.commitTransaction();
            HibernateDBManager.closeSession();
            if (findList == null) {
                return null;
            } else {
                List<PostsBean> beans = new ArrayList<>();
                for (Posts posts : findList) {
                    beans.add(postsTransformer.transformEntityToBean(posts));
                }
                return beans;
            }
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public List<PostsBean> findbyUserID() {
        try {
            HibernateDBManager.setDbConfigFileName("com/store/dal/config/hibernate.cfg.xml");
            HibernateDBManager.buildSessionFactory();
            Session session = HibernateDBManager.getSession();
            HibernateDBManager.beginTransaction();
            PostsDAO dAO = new PostsDAO();
            PostsTransformer postsTransformer = new PostsTransformer();
            List<Posts> findList = dAO.findList();
            HibernateDBManager.commitTransaction();
            HibernateDBManager.closeSession();
            if (findList == null) {
                return null;
            } else {
                List<PostsBean> beans = new ArrayList<>();
                for (Posts posts : findList) {
                    beans.add(postsTransformer.transformEntityToBean(posts));
                }
                return beans;
            }
        } catch (Exception ex) {
            return null;
        }

    }

    @Override
    public List<PostsBean> findbyUserEmail(String email) {
        try {
            HibernateDBManager.setDbConfigFileName("com/store/dal/config/hibernate.cfg.xml");
            HibernateDBManager.buildSessionFactory();
            Session session = HibernateDBManager.getSession();
            HibernateDBManager.beginTransaction();
            PostsDAO dAO = new PostsDAO();
            PostsTransformer postsTransformer = new PostsTransformer();
            List<Posts> find = dAO.findByUserEmail(email);
            HibernateDBManager.commitTransaction();
            HibernateDBManager.closeSession();
            if (find != null) {
                List<PostsBean> beans = new ArrayList();
                for (Posts posts : find) {
                    beans.add(postsTransformer.transformEntityToBean(posts));
                }
                return beans;

            } else {

                return null;

            }
        } catch (Exception ex) {
            return null;
        }
    }

    public PostsBean removePost(int postId) {
        try {
            HibernateDBManager.setDbConfigFileName("com/store/dal/config/hibernate.cfg.xml");
            HibernateDBManager.buildSessionFactory();
            Session session = HibernateDBManager.getSession();
            HibernateDBManager.beginTransaction();
            PostsDAO dAO = new PostsDAO();
            PostsTransformer postsTransformer = new PostsTransformer();
            Posts findById = dAO.findById(postId);
            if (findById!=null){
              dAO.remove(findById); 
              HibernateDBManager.commitTransaction();
            HibernateDBManager.closeSession();
            return postsTransformer.transformEntityToBean(findById);      
            }
            else {
                 HibernateDBManager.commitTransaction();
               HibernateDBManager.closeSession();
               return null;
            }
            } 
         catch (Exception ex) {
            return null;
        }

    }
}
