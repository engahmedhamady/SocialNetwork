package socail_networkdalspring;

import com.store.dal.entities.Posts;
import com.store.dal.manager.HibernateDBManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class Socail_NetworkDALSpring {

    public static void main(String[] args) {

       

        try {
            HibernateDBManager.setDbConfigFileName("com/store/dal/config/hibernate.cfg.xml");
            HibernateDBManager.buildSessionFactory();

            Session session = HibernateDBManager.getSession();
            HibernateDBManager.beginTransaction();
//           File file = new File("C:\\Users\\Sroor For Laptop\\Desktop\\Messenger\\farida.jpeg");
//       byte[] bFile = new byte[(int) file.length()];
//
//        try {
//	     FileInputStream fileInputStream = new FileInputStream(file);
//	     //convert file into array of bytes
//	     fileInputStream.read(bFile);
//	     fileInputStream.close();
//       } catch (Exception e) {
//	     e.printStackTrace();
//       }
//
//            Users users = new Users();
//            users.setUserEmail("aliengahmed@gmail.com");
//            users.setUserPassword("ahmed");
//            users.setFName("sss");
//            users.setLName("sss");
//            users.setUserName("sss" + " " + "sss");
//           
//            users.setUserCountry("usa");
//            users.setUserBirthday("12-3-1029");
//            users.setUserGendre("female");
//            users.setUserImage(bFile);
//            java.util.Date date = new java.util.Date(new java.util.Date().getTime());
//            users.setUserRegDate(date);
//      java.util.Date date = new java.util.Date(new java.util.Date().getTime());
//             PostsDAO usersDAO = new PostsDAO();
//             Posts posts = new Posts();
//             posts.setPostDate(date);
//             posts.setPostContent("alahly up all");
//             posts.setUploadImage(bFile);
//            // posts.setPostId(2);
//             posts.setUserEmail("engahmed@gmail.com");
//             System.out.println("222");
//            usersDAO.add(posts);
//System.out.println("222");
String id ="ahmed@gmail.com";
SQLQuery query = session.createSQLQuery("SELECT * FROM `posts` WHERE `user_email`=?");
query.setParameter(1, id);
List<Object[]> rows = query.list();
List<Posts> posts = new  ArrayList<>();
if (rows != null) {
    for (Object[] row : rows) {
        Posts emp = new Posts();
        emp.setPostId(Integer.parseInt(row[0].toString()));
        emp.setPostContent(row[1].toString());
        emp.setUploadImage(((byte[]) row[2]));
        emp.setPostDate((Date) row[3]);
        emp.setUserEmail(row[4].toString());
        posts.add(emp);
        System.out.println(emp);
    }
    HibernateDBManager.commitTransaction();
    HibernateDBManager.closeSession();
    
    
    
}
        } catch (Exception ex) {
            Logger.getLogger(Socail_NetworkDALSpring.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
