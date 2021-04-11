
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> sign up</title>
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

            width: 1000px;
            height: 60px;
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
        #signup
        {

            width: 60%;
            border-radius: 30px;
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

                        <h3 style="text-align: center;"><strong>join coding cafe</strong></h3>

                    </div>
                    <div class="l-part">
                        <form action="OperationController?page=signin&operation=signup" method="post">
                            <div class="input-group">
                                <span class="input-group-addon">
                                    <i class="glyphicon glyphicon-pencil">

                                    </i>
                                </span>
                                <input id="" type="text" class="form-control" placeholder="First Name" name="firstName" 
                                       required="required">

                            </div><br>
                            <div class="input-group">
                                <span class="input-group-addon">
                                    <i class="glyphicon glyphicon-pencil">

                                    </i>
                                </span>
                                <input type="text" class="form-control" placeholder="Last Name" name="lastName" 
                                       required="required">

                            </div><br>
                            <div class="input-group">
                                <span class="input-group-addon">
                                    <i class="glyphicon glyphicon-lock">

                                    </i>
                                </span>
                                <input  id="password" type="password" class="form-control" placeholder="password" name="password" 
                                        required="required">

                            </div><br>
                            <div class="input-group">
                                <span class="input-group-addon">
                                    <i class="glyphicon glyphicon-user">

                                    </i>
                                </span>
                                <input id="email" type="email" class="form-control" placeholder="email" name="email" 
                                       required="required">

                            </div><br>
                            <div class="input-group">
                                <span class="input-group-addon">
                                    <i class="glyphicon glyphicon-chevron-down">

                                    </i>
                                </span>
                                <select class="form-control" name="country" required="required">
                                    <option disabled=""> select your country </option>
                                    <option > usa </option>
                                    <option > egypt </option>
                                    <option > uk </option>
                                    <option > canada </option>
                                    <option > palastine </option>
                                    <option > syria </option>
                                </select>

                            </div><br>
                            <div class="input-group">
                                <span class="input-group-addon">
                                    <i class="glyphicon glyphicon-chevron-down">

                                    </i>
                                </span>
                                <select class="form-control input-md"  name="gendre" required="required">
                                    <option disabled=""> select your gendre </option>
                                    <option > male</option>
                                    <option > female </option>

                                </select>

                            </div><br>
                            <div class="input-group">
                                <span class="input-group-addon">
                                    <i class="glyphicon glyphicon-calendar">

                                    </i>
                                </span>
                                <input type="date" class="form-control input-md" placeholder="birthday" name="birthday" 
                                       required="required">

                            </div><br>
                            <a style="text-decoration: none;float: right;color: #187FAB;" data-toggle="tooltip" title="signin" href="signin.php"></a><br><br>
                            <center><button id="signup" class="btn btn-info btn-lg" name="sign_up">signup</button></center>
                        </form>

                    </div>

                </div>
            </div>
        </div>
    </body>
</html>
