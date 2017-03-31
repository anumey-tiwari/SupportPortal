<%-- 
    Document   : loggedIn
    Created on : 31 Mar, 2017, 9:23:04 AM
    Author     : Anumey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Index</title>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>

    </head>
    <body>

        <div class="container">
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#">
                        </a>
                    </div>
                </div>
            </nav>
            <div class="row">
                <div class="col-lg-4">
                    <a href="/Company">
                        <button type="button btn-group-lg "   class="btn btn-primary btn-block">
                            View Company Details
                        </button>
                    </a> 
                </div>
                <div class="col-lg-4">
                    <a href="/Company">
                        <button type="button btn-group-lg"   class="btn btn-primary btn-block">
                            View Member Details
                        </button>
                    </a> 
                </div>
                <div class="col-lg-4">
                    <a href="/Company">
                        <button type="button btn-group-lg"   class="btn btn-primary btn-block">
                            View Server Details
                        </button>
                    </a> 
                </div>
            </div>
        </div> <!-- /container -->
    </body>
</html>
