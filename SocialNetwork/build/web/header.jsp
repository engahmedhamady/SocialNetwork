

<%@page import="com.store.presn.constansApp.Constants"%>
<%@page import="com.store.common.beans.UsersBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>-->
        <%

            UsersBean users = (UsersBean) session.getAttribute("bean");
               String userName= users.getUserName();
        %>
        <nav class="navbar navbar-default">

            <div class="container-fluid">

                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                            data-target="#bs-example-navbar-collapse-1" aria-expanded="false" >
                        <span class="sr-only"> Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="" class="navbar-brand">coding cafe</a>
                </div>
                <div class="collapse navbar-collapse" id="#bs-example-navbar-collapse-1">

                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" 

                               role="button" aria-haspopup="true" aria-expanded="false">
                                <span >
                                    <i class="glyphicon glyphicon-chevron-down"> 


                                    </i>
                                </span>
                            </a>

                            <ul class="dropdown-menu">

<!--                                                                <li>
                                                                    <a href="MenuController?page=home&operation=login">MY POSTS
                                                                       <span class="bage bage-secondary"></span>
                                                                    </a>
                                                                </li>-->
                                <li>
                                    <a href="edit_profile.php">Setting</a>
                                </li>
                                <li role="separator" class="divider">

                                </li>
                                <li>
                                    <a href="logout.php">logout</a>
                                </li>
                            </ul>

                        </li>         
                        <li> <a href="OperationController?page=people&operation=findallpeople">Find People</a> </li>&nbsp;&nbsp;
                        <li> <a href="">Messages</a></li>&nbsp;&nbsp;
                        <li> <a href="OperationController?page=home&operation=viewhome">Home</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <li> <a href="OperationController?page=profile&operation=viewprofile"> <%= userName %>   </a> </li>
                        <ul class="nav navbar navbar-right">

                            <li class="dropdown">
                                <form class="navbar-form navbar-left" method="get" action="results.php">
                                    <div class="form-group">
                                        <input type="text" name="user_query" placeholder="Search"
                                               class="form-control">
                                    </div>
                                    <button type="submit" class="btn btn-info" name="search">Search</button>
                                </form>
                            </li>
                        </ul>
                    </ul>
                </div>
            </div>
        </nav>

