<%-- 
    Document   : home
    Created on : Aug 31, 2020, 1:59:52 PM
    Author     : Sroor For Laptop
--%>

<%@page import="com.store.common.beans.PostsBean"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %> 

<!DOCTYPE html>
<html>
    <head>
        <title>profile name</title>
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
            <div id="insert_sort" class="col-sm-12">
                <center>

                    <form action="OperationController?page=home&operation=posting"  method="GET" id="f" enctype="multipart/form-data">
                        <textarea class="form-control" id="content" rows="4" name="content" placeholder="what's in your mind?" >
                        
                        
                        </textarea><br>
                        <label class="btn btn-warning" id="upload_image_button">  select image
                            <input type="file" name="upload_image" size="30" >
                        </label>
                        <button id="btn-post" class="btn btn-success" name="sub"> post</button>
                    </form>

                </center>

            </div>
        </div>
        <!--        <div class="row">
                    <div id="insert_sort" class="col-sm-12">
                        <center>
        
                            <form action="OperationController?page=home&operation=posting"  method="GET" id="f" enctype="multipart/form-data">
                                <textarea class="form-control" id="content" rows="4" name="content" placeholder="what's in your mind?" >
                                
                                
                                </textarea><br>
                                <label class="btn btn-warning" id="upload_image_button">  select image
                                    <input type="file" name="upload_image" size="30" >
                                </label>
                                <button id="btn-post" class="btn btn-success" name="sub"> post</button>
                            </form>
        
                        </center>
        
                    </div>
                </div>-->
        <%  List<PostsBean> posts = (List<PostsBean>) session.getAttribute("allPosts");
            System.out.println(posts);
            if (posts != null) {
            
                for (PostsBean elem : posts) {
                    String content = elem.getPostContent();
                    byte[] image = elem.getUploadImage();
                   
                  

        %> 




     

        <div class="row">
            <div class="col-sm-3">


            </div>
            <div id="posts" class="col-sm-6">
                <div class="row">
                    <div class="col-sm-2">
                      
                        <p>
                            <img src="images/ahmed.jpeg" class="img-circle" width="100px"
                                 height="100px">
                        </p>
                       
                    </div>
                    <div class="col-sm-6">
                        <h3> <a href="" style="text-decoration: none;cursor: pointer;color: #3897f0"> </a></h3>
                        <h4>  
                            <small style="color: black">   update post on 
                                <strong>
                                    <%= elem.getPostDate() %>
                                </strong>
                            </small>
                        </h4>
                    </div>
                    <div class="col-sm-4">


                    </div>

                </div>
                <div class="row">
                    <div class="col-sm-12">
                        <% if (content != null )
                          out.println("<p>");
                            out.println(content);
                         out.println("</p>");
                        %>
                        
                           
                        
                        <img id="posts-img" src="images/ahmed.jpeg" style="height: 350px;">
                        
                    </div>  
                </div><br>
                <a href="" style="float: right;">
                    <button class="btn btn-info">comment</button></a><br>
            </div> 
            <div class="col-sm-3">

            </div>
        </div><br><br>
        <% }}%>
       

        <div class="row">

            <div class="col-sm-12"> 
                
                <center> 
                    <a href="OperationController?page=home&operation=viewhome"><h2> <strong>new feeds</strong></h2><br>   </a>  
                </center>
                      
            </div>
        </div>

    </body>
</html>
