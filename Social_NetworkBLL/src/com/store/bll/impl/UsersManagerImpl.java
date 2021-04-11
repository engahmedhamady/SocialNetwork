package com.store.bll.impl;

import com.store.bll.managers.UsersManager;
import com.store.bll.transformers.UsersTransformer;
import com.store.common.beans.UsersBean;
import com.store.dal.entities.Users;
import com.store.dal.manager.HibernateDBManager;
import com.store.dal.repos.UsersDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

public class UsersManagerImpl implements UsersManager {

    @Override

    public UsersBean login(UsersBean usersBean) {
        try {

            HibernateDBManager.setDbConfigFileName("com/store/dal/config/hibernate.cfg.xml");
            HibernateDBManager.buildSessionFactory();

            Session session = HibernateDBManager.getSession();
            HibernateDBManager.beginTransaction();
            UsersTransformer usersTransformer = new UsersTransformer();
            UsersDAO usersDAO = new UsersDAO();
            Users users = usersDAO.findById(usersTransformer.transformBeanToEntity(usersBean).getUserEmail());
            HibernateDBManager.commitTransaction();
            HibernateDBManager.closeSession();
            if (users == null) {

                return null;
            } else {
                if (usersBean.getUserPassword().equals(users.getUserPassword())) {

                    return usersTransformer.transformEntityToBean(users);
                } else {
                    return null;
                }
            }
        } catch (Exception ex) {

            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public boolean signup(UsersBean usersBean) {
        UsersBean login = login(usersBean);
        if (login != null) {
            return false;
        } else if (login == null) {
            HibernateDBManager.setDbConfigFileName("com/store/dal/config/hibernate.cfg.xml");
            try {
                HibernateDBManager.buildSessionFactory();
            } catch (Exception ex) {
                return false;
            }
            Session session = HibernateDBManager.getSession();
            HibernateDBManager.beginTransaction();
            UsersTransformer usersTransformer = new UsersTransformer();
            UsersDAO usersDAO = new UsersDAO();
            Users add = usersDAO.add(usersTransformer.transformBeanToEntity(usersBean));
            HibernateDBManager.commitTransaction();
            HibernateDBManager.closeSession();

            if (add != null) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public UsersBean updateUserBean(UsersBean usersBean) {
        try {
            HibernateDBManager.setDbConfigFileName("com/store/dal/config/hibernate.cfg.xml");
            HibernateDBManager.buildSessionFactory();
            Session session = HibernateDBManager.getSession();
            HibernateDBManager.beginTransaction();
            UsersTransformer usersTransformer = new UsersTransformer();
            UsersDAO usersDAO = new UsersDAO();
            Users users = usersDAO.update(usersTransformer.transformBeanToEntity(usersBean));
            HibernateDBManager.commitTransaction();
            HibernateDBManager.closeSession();
            if (users == null) {
                return null;
            } else {
                return usersTransformer.transformEntityToBean(users);
            }
        } catch (Exception ex) {
            return null;
        }

    }

    @Override
    public List<UsersBean>listAllUsers() {
        try {
            HibernateDBManager.setDbConfigFileName("com/store/dal/config/hibernate.cfg.xml");
            HibernateDBManager.buildSessionFactory();
            Session session = HibernateDBManager.getSession();
            HibernateDBManager.beginTransaction();
            UsersTransformer usersTransformer = new UsersTransformer();
            UsersDAO usersDAO = new UsersDAO();
            List<Users> users = usersDAO.findList();
            HibernateDBManager.commitTransaction();
            HibernateDBManager.closeSession();
            if (users == null) {
                return null;
            } else {
                List<UsersBean> beans = new ArrayList<>();
                for (Users posts : users) {
                    beans.add(usersTransformer.transformEntityToBean(posts));
                }
                return beans;
            }
        } catch (Exception ex) {
            return null;
        }
    }
 @Override
    public UsersBean findByUserName(String name) {
        try {
            HibernateDBManager.setDbConfigFileName("com/store/dal/config/hibernate.cfg.xml");
            HibernateDBManager.buildSessionFactory();
            Session session = HibernateDBManager.getSession();
            HibernateDBManager.beginTransaction();
            UsersTransformer usersTransformer = new UsersTransformer();
            UsersDAO usersDAO = new UsersDAO();
           Users users = usersDAO.findById((name));
            HibernateDBManager.commitTransaction();
            HibernateDBManager.closeSession();
            if (users == null) {
                return null;
            } else {
                return usersTransformer.transformEntityToBean(users);
            }
        } catch (Exception ex) {
            return null;
        }
    }
@Override
    public UsersBean findByUserEmail(String name) {
        try {
            HibernateDBManager.setDbConfigFileName("com/store/dal/config/hibernate.cfg.xml");
            HibernateDBManager.buildSessionFactory();
            Session session = HibernateDBManager.getSession();
            HibernateDBManager.beginTransaction();
            UsersTransformer usersTransformer = new UsersTransformer();
            UsersDAO usersDAO = new UsersDAO();
           Users users = usersDAO.findById((name));
            HibernateDBManager.commitTransaction();
            HibernateDBManager.closeSession();
            if (users == null) {
                return null;
            } else {
                return usersTransformer.transformEntityToBean(users);
            }
        } catch (Exception ex) {
            return null;
        }
    }

}
