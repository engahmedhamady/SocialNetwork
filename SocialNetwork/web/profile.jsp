
<%@page import="com.store.common.beans.PostsBean"%>
<%@page import="java.util.List"%>
<%@page import="com.store.common.beans.UsersBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"       uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"     uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn"      uri="http://java.sun.com/jsp/jstl/functions" %>

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

        #cover-img{

            width: 1000px;
            height: 400px;
        }
        #profile-img
        {

            position: absolute;
            bottom: 0px;
            right: 0px;

        }
        #update_profile
        {

            position:relative;
            top: -33px;
            cursor: pointer;
            left: 93px;
            border-radius: 4px;
            background-color: rgba(0,0,0,0.1);
            transform: translate(-50%,-50%);

        }
        #button_profile
        {
            position:absolute;
            top: 82%;
            cursor: pointer;
            left: 50%;
            transform: translate(-50%,-50%);

        }
        #own_posts{

            border: 5px solid #e6e6e6;
            padding: 40px 50px;

        }
        #post_img{

            height: 300px;
            width: 100%;

        }
        .bigText{
            
            height: 200px;
            width: 600px;
        }
    </style>
    <body>
        <%@ include file="header.jsp" %> 

        
        <div class="row">
            <div class="col-sm-2">

            </div>
            <div class="col-sm-8">
                <div>
                    <div><img id="cover-img" class="img-rounded" width="600" height="600" src="images/ahmed.jpeg" alt="cover"></div>
                    <form action="" method="post" enctype="multipart/form-data">
                        <ul class="nav pull-left" style="position:absolute; bottom: 10px; left: 40px;">
                            <li class="dropdown">
                                <button class="dropdown-toggle btn btn-default" data-toggle="dropdown">
                                    change cover
                                </button>
                                <div class="dropdown-menu">
                                    <center>
                                        <!--                                        <p>
                                                                                    click <strong>select cover</strong><br>
                                                                                    <strong>update cover</strong>
                                                                                </p>-->
                                        <label class="btn btn-info">
                                            <input type="file" name="u_cover" size="60">

                                        </label><br><br>
                                        <button name="submit" class="btn btn-info">update cover</button>
                                    </center>
                                </div>

                            </li>
                        </ul>
                    </form>
                </div>

                <div id='profile-img'>
                    <img src="" alt="profile" class="img-circle" width="180px" height="185px">
                    <form action="OperationController?page=profile&operation=updateprofilephoto"  method="post" enctype="multipart/form-data">

                        <ul class="nav pull-left" style="position:absolute; bottom:0px; left: 40px;">
                            <li class="dropdown">
                                <button id="btn-profile"class="btn btn-info" name="update" data-toggle="dropdown">
                                    update profile
                                </button>
                                <div class="dropdown-menu">
                                    <center>
                                        <!--                                        <p>
                                                                                    click <strong>select cover</strong>and then click <br>
                                                                                    <strong>update cover</strong>
                                                                                </p>-->
                                        <label  class="btn btn-info">
                                            <input type="file" name="u_cover" size="60">

                                        </label><br><br>
                                        <button name="submit" class="btn btn-info">update cover</button>
                                    </center>
                                </div>

                            </li>
                        </ul>

                    </form>

                </div >

            </div><br>
            <div class="col-sm-2">

            </div>
        </div >
        <div class="row">

            <div class="col-sm-2">

            </div>
            <div class="col-sm-2" style="background-color: #e6e6e6;text-align: center;left: 0.8%;
                 border-radius: 5px; ">
                <center>
                    <h2> <strong>About</strong></h2>
                </center>
                <center>
                    <h4> <strong>
                            ${sessionScope.bean.userName}    
                        </strong>
                    </h4>
                </center>
                <p>
                    <strong>
                        <i style="color: grey;">

                        </i>
                    </strong>
                </p><br>
                <p>
                    <strong>
                        Relationship 
                    </strong>
                  ${sessionScope.bean.relationship}    
                </p><br>

                <p>
                    <strong>
                        lives in
                    </strong>
                    ${sessionScope.bean.userCountry}    
                </p><br>
                <p>
                    <strong>
                        member since
                    </strong>
                     ${sessionScope.bean.userRegDate}
                </p><br>
                <p>
                    <strong>
                        gendre
                    </strong>
                    ${sessionScope.bean.userGendre}
                </p><br>
                <p>
                    <strong>
                        date oof birth
                    </strong>
                  ${sessionScope.bean.userBirthday}
                </p><br>
            </div>
            <div class="col-sm-6">


            </div>

        </div>
        <br><br>
        <div class="row">
            <div id="insert_sort" class="col-sm-12">
                <center>

                    <form action="OperationController?page=profile&operation=posting"  method="POST" id="f" enctype="multipart/form-data">
                     <textarea class="form-control" id="content" rows="4" name="content" placeholder="what's in your mind?" >
                        
                                         </textarea>
                       

                        <br>
                        <label class="btn btn-warning" id="upload_image_button">  select image
                            <input type="file" name="upload_image" size="30" >
                        </label>
                        <button id="btn-post" class="btn btn-success" name="sub"> post</button>
                    </form>

                </center>

            </div>
        </div><br><br><br>    
            
         
        <c:forEach items="${sessionScope.userPosts}" var="posts" >
        <div class="row">
            <div class="col-sm-3">


            </div>
            <div id="posts" class="col-sm-6">
                <div class="row">
                    <div class="col-sm-2">

                        <p>
                            <img src=" ${posts.uploadImage} " class="img-circle" width="100px"
                                 height="100px">
                        </p>

                    </div>
                    <div class="col-sm-6">
                        <h3> <a href="OperationController?page=profile&operation=viewprofile" style="text-decoration: none;cursor: pointer;color: #3897f0"> 
                              ${sessionScope.bean.userName}   


                            </a></h3>
                        <h4>  

                            <small style="color: black">   update post on 
                                <strong>
                                     ${posts.postDate} 
                                </strong>
                            </small>
                        </h4>
                    </div>
                    <div class="col-sm-4">


                    </div>

                </div>
                <div class="row">
                    <div class="col-sm-12">
                        
                              <p>
                           
                              ${posts.postContent} 
                          </p>
                        



                        <img id="posts-img" src="images/ahmed.jpeg" style="height: 350px;">

                    </div>  
                </div><br>
                <a href="" style="float: right;">
                    <button class="btn btn-info">comment</button></a><br>
                <a href="OperationController?page=profile&operation=deletepost&id=${posts.userEmail}&post=${posts.postId} "style="float: left;">
                    <button class="btn btn-success">view</button></a>


                <a href="OperationController?page=profile&operation=deletepost&id=${posts.userEmail}&post=${posts.postId} " style="float: left;">
                    <button class="btn btn-info">edit</button></a>

                <a href="OperationController?page=profile&operation=deletepost&id=${posts.userEmail}&post=${posts.postId} " style="float: left;">
                    <button class="btn btn-danger">delete</button></a><br>
            </div> 
            <div class="col-sm-3">

            </div>
        </div><br><br>
      
</c:forEach>


    </body>
</html>

