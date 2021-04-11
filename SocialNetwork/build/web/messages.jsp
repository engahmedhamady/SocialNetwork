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
            <div class="col-sm-3" id="select_user">
                <div class="container-fluid">
                    <a href="">
                        <img class="img-circle" src=""width="90px"height="80px"title=""/> 
                        <strong> $nbsp </strong><br><br>
                    </a>
                </div>
                
            </div>
            <div class="col-sm-6">
                <div class="load_msg" id="scroll_messages">
                    <div>
                        <p>   
                        <div class="message" id="blue" data-toggle="tooltip" title=""> 
                            message body
                        </div><br><br><br>
                        <div class="message" id="green"  data-toggle="tooltip" title="">
                            
                            
                        </div><br><br><br>
                        
                        </p>
                    </div> 
                </div>
                <form>
                    <center>
                        
                        <h3> select someone to start conversation</h3> </center>
                        <textarea disabled="" class="form-control" placeholder="enter your message"></textarea>
                        <input type="submit" class="btn btn-default" disabled="" value="send"/><br><br>
                   
                    
                </form>
                   <form>
                        <textarea class="form-control" placeholder="enter your message"
                                  name="msg_box" id="message_textarea"></textarea>
                        <input type="submit" class="btn btn-default"name="send_msg" id="btn-msg" value="send"/><br><br>
                   
                    
                </form>
            </div>
        </div>
        





    </body>
</html>
