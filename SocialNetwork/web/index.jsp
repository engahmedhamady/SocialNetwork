

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>coding cafe login and signup</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    </head>
    <style >

        body
        {

            overflow-x: hidden; 
        }
        #centered1{

            position: absolute;
            font-size: 3vw;
            top: 30%;
            left:30%;
            transform: translate(-50%,-50%);
        }
        #centered2{

            position: absolute;
            font-size: 3vw;
            top: 50%;
            left:40%;
            transform: translate(-50%,-50%);
        }
        #centered3{

            position: absolute;
            font-size: 3vw;
            top: 70%;
            left:30%;
            transform: translate(-50%,-50%);
        }
        #signup
        {

            width: 60%;
            border-radius: 30px;
        }
        #login
        {

            width: 60%;
            background-color:#fff;
            border:  2px solid #1da1f2;
            color: #1da1f2;
            border-radius: 30px;
        }
        #login:hover
        {

            width: 60%;
            background-color:#fff;
            border:  2px solid #1da1f2;
            color: #1da1f2;
            border-radius: 30px;
        }
        .well{
            background-color: #187FAB;

        }
    </style>

    <body>
        <div class="row">

            <div class="col-sm-12"> 
                <div class="well">
                    <center>
                        <h1 style="color:white">coding cafe</h1>
                    </center>

                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6" style="left:0.5%;">
                <img src="images/logo.webp" class="img-rounded" title="coding cafe" width="650px" height="565px">
                <div id="centered1" class="centered">
                    <h3 style="color:black;"> <span class="glyphiconglyphicon-search"></span>&nbsp&nbsp
                        <strong>follow your intrests.</strong>
                    </h3>
                </div> 
                <div id="centered2" class="centered">
                    <h3 style="color:black;"> <span class="glyphiconglyphicon-search"></span>&nbsp&nbsp
                        <strong>hear what people are talking about.</strong>
                    </h3>
                </div> 
                <div id="centered3" class="centered">
                    <h3 style="color:black;"> <span class="glyphiconglyphicon-search"></span>&nbsp&nbsp
                        <strong>join the conversation.</strong>
                    </h3>
                </div> 

            </div>
            <div class="col-sm-6" style="left:8%;">
                <img src="images/logo1.png" class="img-rounded" title="coding cafe" width="80px" height="80px">
                <h2>
                    <strong>see what's hapenning in.<br> the world right now</strong><br><br>
                </h2>
                <h4>
                    <strong>join coding cafe today. </strong>
                </h4>
                <form method="post" action="signup.jsp">
                    <button id="signup" class="button btn-info btn-lg" name="signup">sign up</button><br><br>
              
                </form>
                <form method="post" action="signin.jsp">
                    
                    <button id="login" class="button btn-info btn-lg" name="login">log in</button><br><br>
                </form>
            </div>
        </div>
    </body>
</html>   