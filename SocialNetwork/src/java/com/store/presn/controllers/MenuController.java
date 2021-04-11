/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.presn.controllers;

import com.store.presn.constansApp.Constants;
import com.store.bll.delegate.StoreGetWay;
import com.store.common.beans.UsersBean;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.cfg.beanvalidation.BeanValidationIntegrator;

/**
 *
 * @author ahmed
 */
public class MenuController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String page = request.getParameter("page");
        HttpSession session = request.getSession(true);
        RequestDispatcher requestDispatcher = null;
  UsersBean usersBean  = (UsersBean)   session.getAttribute("bean");
//ApplicationContext context = new ClassPathXmlApplicationContext("/com/store/bll/config/bll-spring-context.xml");
     StoreGetWay getWay =   new StoreGetWay();


        if (page == null || page.equals("") || page.trim().equals("")) {
            request.setAttribute(Constants.TITLE_ATTRIBUTE, "login page");
            requestDispatcher = request.getRequestDispatcher("index.jsp");
        }

        if (page.equals("home")) {
           UsersBean admin = (UsersBean) session.getAttribute("bean");
            System.out.println(admin.getUserGendre());
            if (admin == null || !admin.getIsLegalLogin().equals("1")) {

                request.setAttribute(Constants.TITLE_ATTRIBUTE, "login page");
                
                requestDispatcher = request.getRequestDispatcher("signin.jsp");
               

            } else {
                request.setAttribute(Constants.TITLE_ATTRIBUTE, "home page");
                requestDispatcher = request.getRequestDispatcher(page + ".jsp");
            }
        } 
         else if (page.equals("profile")) {
            request.setAttribute(Constants.TITLE_ATTRIBUTE, usersBean.getUserName());
               
            requestDispatcher = request.getRequestDispatcher("profile.jsp");

        }
         else if (page.equals("userprofile")) {
            request.setAttribute(Constants.TITLE_ATTRIBUTE, usersBean.getUserName());
               
            requestDispatcher = request.getRequestDispatcher("userprofile.jsp");

        }
         else if (page.equals("people")) {
            request.setAttribute(Constants.TITLE_ATTRIBUTE, usersBean.getUserName());
               
            requestDispatcher = request.getRequestDispatcher("people.jsp");

        }
        else if (page.equals("logout")) {
            request.setAttribute(Constants.TITLE_ATTRIBUTE, "login page");
            ((UsersBean) session.getAttribute("log")).setIsLegalLogin("0");

            session.removeAttribute("log");

            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
            session.invalidate();
            requestDispatcher = request.getRequestDispatcher("index.jsp");

        } else if (page.equals("errorPage")) {
            request.setAttribute(Constants.TITLE_ATTRIBUTE, "error Page");
            requestDispatcher = request.getRequestDispatcher("errorPage.html");
        } 
         else if (page.equals("index")) {
            request.setAttribute(Constants.TITLE_ATTRIBUTE, "check Page");
            requestDispatcher = request.getRequestDispatcher("index.jsp");
        }else {
            request.setAttribute(Constants.TITLE_ATTRIBUTE, "login page");
            requestDispatcher = request.getRequestDispatcher("index.jsp");
        }

        requestDispatcher.forward(request, response);

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
    }

}
