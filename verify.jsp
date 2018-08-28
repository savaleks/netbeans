<%-- 
    Document   : verify
    Created on : Aug 27, 2018, 6:32:08 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String username = (String)session.getAttribute("username");
    if(username==null){
        response.sendRedirect("index.jsp");
                return;
    }
            %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verifying Page</title>
    </head>
    <body>
        Welcome <%=username%>!<br>
        <a href="logout">Log out</a>
    </body>
</html>
