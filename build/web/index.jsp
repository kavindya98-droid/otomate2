<%-- 
    Document   : index
    Created on : May 13, 2020, 2:27:03 PM
    Author     : Kavindya Nirmani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUYALL</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <link href="cssfol/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body onload="checkSignIn();">
        <div class="container">

            <%--login button--%>
            <button data-toggle="modal" data-target="#log">sign in</button>

            <%--start login modal--%>
            <div class="modal fade" tabindex="-1" role="dialog" id="log">
                <div class="modal-dialog modal-dialog-scrollable modal-lg" role="document">
                    <div class="modal-content bg-dark">
                        <div class="modal-header">
                            <h5 class="modal-title" style="color: #ffffff;">Sign In</h5>
                            <button class="close" type="button" data-dismiss="modal" area-label="close">
                                <span area-hidden="true" style="color: #ffffff;">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="mr-auto ml-auto" id="signin">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div> 
                </div>
            </div> 
            <%--end login modal--%>
            
            <%--strat shop card--%>
            
            <%--end shop card--%>
        </div>
        <script type="text/javascript" src="jsfol/script.js"></script>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>    

    </body>
</html>
               