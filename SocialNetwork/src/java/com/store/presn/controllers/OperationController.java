/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.presn.controllers;

import com.store.bll.delegate.StoreGetWay;
import com.store.common.beans.PostsBean;
import com.store.common.beans.UsersBean;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Sroor For Laptop
 */
public class OperationController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String page = request.getParameter("page");
        String operation = request.getParameter("operation");

        RequestDispatcher dispatcher = null;
        HttpSession session = request.getSession();
        StoreGetWay getWay = new StoreGetWay();

        if (page == null || page.equals("") || page.trim().equals("")) {
            dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }

        if (operation == null || operation.equals("") || operation.trim().equals("")) {
            dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }
        if (operation.equals("login")) {
           
              //  OutputStream o = response.getOutputStream();
               //  File file = new File("images\\"+adminBean.getUserEmail()+".jpeg");
                 
              //  FileOutputStream fos = new FileOutputStream(file);
              //  fos.write(adminBean.getUserImage());
              //  o.flush();
              //  o.close();
               
                PostsBean postsBean = new PostsBean();
                List<PostsBean> listAll = getWay.listAll();
                if (listAll != null) {
                    session.setAttribute("allPosts", listAll);
                } else {
                    session.setAttribute("allPosts", null);  
            } 
                 response.sendRedirect("MenuController?page=" + page);

        } else if (operation.equals("viewhome")) {

            PostsBean postsBean = new PostsBean();
            List<PostsBean> listAll = getWay.listAll();
            if (listAll != null) {
                session.setAttribute("allPosts", listAll);
            } else {
                session.setAttribute("allPosts", null);

            }
            response.sendRedirect("MenuController?page=" + page);

        } else if (operation.equals("viewprofile")) {
            PostsBean postsBean = new PostsBean();
            UsersBean usersBean = (UsersBean) session.getAttribute("bean");
            List<PostsBean> listAll = getWay.findPostByUserEmail(usersBean.getUserEmail());
            if (listAll != null) {
                session.setAttribute("userPosts", listAll);

            } else {
                session.setAttribute("userPosts", null);

            }
            response.sendRedirect("MenuController?page=" + page);

        } else if (operation.equals("updateprofilephoto")) {
            UsersBean adminBean = (UsersBean) session.getAttribute("bean");
            ServletFileUpload fileUpload = new ServletFileUpload(new DiskFileItemFactory());
            try {
                List<FileItem> parseRequest = fileUpload.parseRequest(request);
                for (FileItem fileItem : parseRequest) {
                    String name = fileItem.getName();
                    InputStream inputStream = fileItem.getInputStream();
                    byte[] bFile = new byte[(int) fileItem.getSize()];
                    inputStream.read(bFile);
                    inputStream.close();
                    adminBean.setUserImage(bFile);

                }
                UsersBean updateUserBean = getWay.updateUserBean(adminBean);
                // session.setAttribute("bean", updateUserBean);
            } catch (FileUploadException ex) {
                Logger.getLogger(OperationController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(OperationController.class.getName()).log(Level.SEVERE, null, ex);
            }
            response.sendRedirect("MenuController?page=" + page);

        } else if (operation.equals("signup")) {
            String fName = request.getParameter("firstName");
            String lName = request.getParameter("lastName");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String country = request.getParameter("country");
            String birthDay = request.getParameter("birthday");
            String gendre = request.getParameter("gendre");
            UsersBean usersBean = new UsersBean();
            usersBean.setFName(fName);
            usersBean.setLName(lName);
            usersBean.setUserName(fName + " " + lName);
            usersBean.setUserPassword(password);
            usersBean.setUserEmail(email);
            usersBean.setUserCountry(country);
            usersBean.setUserBirthday(birthDay);
            usersBean.setUserGendre(gendre);
            java.util.Date date = new java.util.Date(new java.util.Date().getTime());
            usersBean.setUserRegDate(date);

            UsersBean login = getWay.login(usersBean);
            if (login == null) {
                boolean b = getWay.signup(usersBean);
                if (b) {
                    session.setAttribute("bean", usersBean);
                    response.sendRedirect("MenuController?page=" + page);
                } else {
                    session.setAttribute("bean", null);
                    response.sendRedirect("MenuController?page=signup");
                }

            } else {

                session.setAttribute("bean", null);
                response.sendRedirect("MenuController?page=signup");
            }

        } else if (operation.equals("updateprofilephoto")) {
            InputStream inputStream = null; // input stream of the upload file
            // obtains the upload file part in this multipart request
            Part filePart = request.getPart("photo");
            if (filePart != null) {
                // prints out some information for debugging
                System.out.println(filePart.getName());
                System.out.println(filePart.getSize());
                System.out.println(filePart.getContentType());
                inputStream = filePart.getInputStream();
                UsersBean name = (UsersBean) session.getAttribute("bean");
                byte[] userImage = new byte[(int) filePart.getSize()];
                // String contentType = filePart.getContentType();
                inputStream.read(userImage);
                // userImage=contentType.getBytes();
                name.setUserImage(userImage);
                UsersBean updateUserBean = getWay.updateUserBean(name);
                response.sendRedirect("MenuController?page=" + page);
            }
        } else if (operation.equals("updatecoverphoto")) {

        } else if (operation.equals("posting")) {
           
            String content = request.getParameter("content");
             System.out.println(content);
            java.util.Date date = new java.util.Date(new java.util.Date().getTime());
            UsersBean attribute = (UsersBean) session.getAttribute("bean");

            PostsBean bean = new PostsBean();
            bean.setPostContent(content);
            bean.setPostDate(date);
            bean.setUserEmail(attribute.getUserEmail());
           
            PostsBean postsBean = getWay.insert(bean);
            
            response.sendRedirect("MenuController?page="+page );
        }
        else if (operation.equals("deletepost")) {
            String user = request.getParameter("id");
            int post = Integer.parseInt(request.getParameter("post"));

            PostsBean removePost = getWay.removePost(post);

            if (removePost != null) {
                List<PostsBean> listAll = getWay.findPostByUserEmail(user);
                session.setAttribute("userPosts", listAll);

            }

            response.sendRedirect("MenuController?page=" + page);

        } else if (operation.equals("findallpeople")) {

            List<UsersBean> listAllUsers = getWay.listAllUsers();
            session.setAttribute("allpeople", listAllUsers);
            response.sendRedirect("MenuController?page=" + page);
        }
        if (operation.equals("userprofile")) {
            String email = request.getParameter("id");

            UsersBean login = getWay.findByUserEmail(email);
            if (login != null) {
                List<PostsBean> findbyUserEmail = getWay.findPostByUserEmail(email);
                System.out.println(findbyUserEmail);
                session.setAttribute("userprofile", login);
                session.setAttribute("userprofileposts", findbyUserEmail);
                // PostsBean postsBean = new PostsBean();

                response.sendRedirect("MenuController?page=" + page);
            } else {

                response.sendRedirect("MenuController?page=index.jsp");
            }

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
