 <%-- 
    Document   : signin
    Created on : Aug 27, 2020, 9:58:04 PM
    Author     : Sroor For Laptop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>signin</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    </head>
    <style>
        body
        {

            overflow-x: hidden;
        }

        .main-content{

            width: 500px;
            height: 400px;
            margin: 10px;
            background-color: #fff;
            border: 2px solid #e6e6e6;
            padding: 40px 50px;
        }
        .header
        {

            border: 0px solid#000;
            margin-bottom:  5px;
        }
        .well{
            background-color: #187FAB;

        }
        #signin
        {

            width: 60%;
            border-radius: 30px;
        }
        .overlap-text
        {

            position: relative;


        }
        .overlap-text a{

            position: absolute;
            top: 8px;
            right: 10px;
            font-size: 14px;
            text-decoration: none;
            font-family: 'Overpass Mono', monospace;
            letter-spacing: -1px;


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
            <div class="col-sm-12">

                <div class="main-content">
                    <div class="header">
                        <h3 style="text-align: center;"><strong>login to coding cafe</strong></h3>
                    </div>
                    <div class="l-part">
                        <form action="OperationController?page=home&operation=login" method="post">
                            <input type="email" name="email" placeholder="Email" required="required" 
                                   class="form-control input-md"><br>
                            <div class="overlap-text">
                                <input type="password" name="password" placeholder="Password" required="required"
                                       class="form-control input-md"><br>
                                <a style="text-decoration:none; float: right;color: #187FAB; " 
                                   data-toggle="tooltip" title="Reset Password" href="">forgot?</a>
                            </div>
                            <a style="text-decoration: none;float: right;color: #187FAB;" data-toggle="tooltip" title="signin" href="signin.php"> don't have an account</a><br><br>
                            <center><button id="signin" class="btn btn-info btn-lg" name="login">login</button></center>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
