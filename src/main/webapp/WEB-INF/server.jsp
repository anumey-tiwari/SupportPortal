<%-- 
    Document   : server
    Created on : 30 Mar, 2017, 11:10:43 PM
    Author     : Anumey
--%>

<%@page import="com.anumey.dto.ServerDetailsDto"%>
<%@page import="java.util.ArrayList"%>
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

        <title>Server Details</title>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-lg-2"></div>
                <div class="col-lg-8">
                    <table class="table table-hover">
                        <tr>
                            <th> Server ID </th>
                            <th> Https IP </th> 
                            <th> Https Port </th>
                            <th> Https Enabled </th>
                            <th> Websocket IP </th>
                            <th> Welcome Port </th>
                            <th> Welcome Enabled</th>
                        </tr>
                        <%
                            ArrayList<ServerDetailsDto> serverList = (ArrayList<ServerDetailsDto>) request.getAttribute("list");
                        %>
                        <% for (ServerDetailsDto server : serverList) {%>
                        <tr>
                            <td><%=server.getServerID() %></td>
                            <td><%=server.getHttpsIP() %></td>
                            <td ><%=server.getHttpPort() %></td>
                            <td ><%=server.isHttpsEnabled() %></td>
                            <td ><%=server.getWebSocketIP()  %></td>
                            <td ><%=server.getWebSocketPort() %></td>
                            <td><%=server.isWebSocketEnabled() %></td>
                            <td></td>
                        </tr>
                        <%}%>
                    </table>
                </div>
                <div class="col-lg-2"></div>
            </div>
        </div> <!-- /container -->
    </body>
</html>
