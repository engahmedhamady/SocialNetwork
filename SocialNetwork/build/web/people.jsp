<%@page import="java.util.List"%>
<%@page import="com.store.common.beans.UsersBean"%>
 <%@ include file="header.jsp" %> 
 
 <%@ taglib prefix="c"       uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"     uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn"      uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <title>find peaple</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="style/home_style2.css">
    </head>
    <style >

    </style>
    <body>

        <div class="row">
            <div class="col-sm-12">
                <center>
                    <h2> find new people </h2><br><br>
                    <div class="row">
                        <div class="col-sm-4">

                        </div>
                        <div class="col-sm-4">
                            <form class="navbar-form navbar-left"action="">
                                <input type="text"  name="search_user" placeholder="Search Friend">
                                <button class="btn btn-info"   type="submit" name="search_user_btn">search</button>
                            </form>
                        </div>
                        <div class="col-sm-4">

                        </div><br><br><br>
                    </div>
                </center>
            </div>
        </div><br><br><br>
        <c:forEach items="${allpeople}" var="people" >
             <div class="row">
            <div class="col-sm-3">


            </div>
            <div id="posts" class="col-sm-6">
                <div class="row" id="find_people">

                    <div class="col-sm-4">          
                        <a href="">
                              <img src="images/ahmed.jpeg" class="img-circle" width="150px"
                                   ritle="" height="140px" style="float: left; margin: 1px;"/>
                        </a>

                    </div><br><br><br>
                    <div class="col-sm-6">
                        <a href="OperationController?page=userprofile&operation=userprofile&id=${people.userEmail}" style="text-decoration: none;cursor: pointer;color: #3897f0"> 
                             <strong><h2>
                                 ${people.userName}
                                    
                                </h2></strong>
                            </a>
                          

                    </div>
                    <div class="col-sm-3">


                    </div>

                </div>
                  <a href="" style="float: right;">
                    <button class="btn btn-info">Add</button></a><br>
              </div>

                <div class="col-sm-4">

                </div>
            </div><br><br><br>
  
</c:forEach>
     


            </body>
            </html>