package com.store.bll.delegate;

import com.store.bll.impl.CommentsManagerImpl;
import com.store.bll.impl.PostsManagerImpl;
import com.store.bll.impl.UserMessagesManagerImpl;
import com.store.bll.impl.UsersManagerImpl;
import com.store.common.beans.PostsBean;
import com.store.common.beans.UsersBean;
import java.util.List;

public class StoreGetWay {

    UsersManagerImpl usersManagerImpl = new UsersManagerImpl();
    CommentsManagerImpl commentsManagerImpl = new CommentsManagerImpl();
    PostsManagerImpl postsManagerImpl = new PostsManagerImpl();
    UserMessagesManagerImpl userMessagesManagerImpl = new UserMessagesManagerImpl();

    //=================================================================
    public UsersBean login(UsersBean usersBean) {
        return usersManagerImpl.login(usersBean);
    }

    public boolean signup(UsersBean usersBean) {
        return usersManagerImpl.signup(usersBean);
    }

    public UsersBean updateUserBean(UsersBean usersBean) {
        return usersManagerImpl.updateUserBean(usersBean);
    }

    public List<UsersBean> listAllUsers() {
        return usersManagerImpl.listAllUsers();
    }

    public UsersBean findByUserName(String name) {
        return usersManagerImpl.findByUserName(name);
    }

    public UsersBean findByUserEmail(String name) {
        return usersManagerImpl.findByUserEmail(name);
    }
    
   //===============================================================

    public PostsBean insert(PostsBean postsBean) {
        return postsManagerImpl.insert(postsBean);
    }

    public List<PostsBean> listAll() {
        return postsManagerImpl.listAll();
    }

    public List<PostsBean> findbyUserID() {
        return postsManagerImpl.findbyUserID();
    }

    public List<PostsBean> findPostByUserEmail(String email) {
        return postsManagerImpl.findbyUserEmail(email);
    }

    public PostsBean removePost(int postId) {
        return postsManagerImpl.removePost(postId);
    }

    
    

}
