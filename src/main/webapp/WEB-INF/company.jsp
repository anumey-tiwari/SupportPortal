<%-- 
    Document   : company
    Created on : 30 Mar, 2017, 10:59:57 PM
    Author     : Anumey
--%>

<%@page import="com.anumey.dto.CompanyDetailsDto"%>
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
                            <th> Company ID </th>
                            <th> Name </th> 
                            <th> Email Id </th>
                            <th> Signaling Id</th>
                            <th> Chat Id</th>
                        </tr>
                        <%
                            ArrayList<CompanyDetailsDto> companyList = (ArrayList<CompanyDetailsDto>) request.getAttribute("list");
                        %>
                        <% for (CompanyDetailsDto company : companyList) {%>
                        <tr>
                            <td><%=company.getCompanyID()%></td>
                            <td ><%=company.getName()%></td>
                            <td ><%=company.getEmailId()%></td>
                            <td ><%=company.getSignallingID()%></td>
                            <td ><%=company.getChatID()%></td>
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