<%-- 
    Document   : second
    Created on : Aug 27, 2018, 7:25:52 PM
    Author     : PC
--%>

<%@page import="baltictalents.loginService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String username = (String) session.getAttribute("username");
    if (username == null) {
        response.sendRedirect("index.jsp");
        return;
    }
     if(!(loginService.testPermission(username, "viewSecond"))){
        response.sendRedirect("verify.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Second Page</title>
    </head>
    <body>
        <h1>Welcome!</h1>
    </body>
</html>
