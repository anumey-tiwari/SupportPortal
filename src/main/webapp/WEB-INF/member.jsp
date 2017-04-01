<%-- 
    Document   : member
    Created on : 30 Mar, 2017, 11:00:07 PM
    Author     : Anumey
--%>

<%@page import="com.anumey.dto.MemberDetailsDto"%>
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

        <title>Company Details</title>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-lg-2"></div>
                <div class="col-lg-8">
                    <table class="table table-hover">
                        <tr>
                            <th> Member ID </th>
                            <th> Email ID </th> 
                            <th> Password </th>
                            <th> Activation Status </th>
                            <th> Company ID </th>
                            <th> Deleted </th>
                        </tr>
                        <%
                            ArrayList<MemberDetailsDto> memberList = (ArrayList<MemberDetailsDto>) request.getAttribute("list");
                        %>
                        <% for (MemberDetailsDto member : memberList) {%>
                        <tr>
                            <td><%=member.getMemberID() %></td>
                            <td><%=member.getEmailID() %></td>
                            <td ><%=member.getPassword()  %></td>
                            <td ><%=member.getActivationStatus() %></td>
                            <td ><%=member.getCompanyID()  %></td>
                            <td ><%=member.getIsDeleted()    %></td>
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
