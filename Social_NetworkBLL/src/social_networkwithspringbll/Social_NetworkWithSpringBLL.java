/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social_networkwithspringbll;

import com.store.bll.delegate.StoreGetWay;
import com.store.common.beans.PostsBean;
import com.store.common.beans.UsersBean;
import java.util.List;


public class Social_NetworkWithSpringBLL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          StoreGetWay storeGetWay = new StoreGetWay();
//         UsersBean usersBean = new UsersBean();
//         usersBean.setUserEmail("engahmed@gmail.com");
//          
//           usersBean.setUserPassword("ahmed");
//        System.out.println(  storeGetWay.login(usersBean));
//        System.out.println(storeGetWay.login(usersBean).getUserBirthday());
 java.util.Date date = new java.util.Date(new java.util.Date().getTime());
//      //     UsersBean attribute = (UsersBean) session.getAttribute("bean");
//           String id ="ahmed@gmail.com";
//            
//        List<PostsBean> findbyUserEmail = storeGetWay.findbyUserEmail(id);
//        System.out.println(findbyUserEmail);
   PostsBean bean =new PostsBean();
   bean.setUserEmail("ali@gmail.com");
    bean.setPostDate(date);
    bean.setPostContent("alisayedali");
      List<PostsBean> listAll = storeGetWay.findPostByUserEmail("mostafa@gmail.com");
         for (PostsBean postsBean : listAll) {
             System.out.println(postsBean);
        }
storeGetWay.insert(bean);
        }
        
    }
    

