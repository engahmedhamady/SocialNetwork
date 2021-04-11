/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.bll.managers;

import com.store.common.beans.UsersBean;
import java.util.List;



/**
 *
 * @author Sroor For Laptop
 */
public interface UsersManager {

  public UsersBean login(UsersBean usersBean);
  public boolean signup(UsersBean usersBean);
 public UsersBean updateUserBean(UsersBean usersBean);
  public List<UsersBean> listAllUsers();
   public UsersBean findByUserName(String name);
    public UsersBean findByUserEmail(String name);
}
