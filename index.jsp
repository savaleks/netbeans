<%-- 
    Document   : index
    Created on : Aug 27, 2018, 6:26:51 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Page</title>
    </head>
    <body>
        <%--creating simple jsp login form with two fields and method post, this page will be showed first --%>
        <form action="login" method="post"> <%--creating simple jsp form with two fields and method post--%>
            enter name: <input type="text" name="login"/>
            enter password: <input type="password" name="pass"/>
            <br/><input type="submit"/>      
        </form>
    </body>
</html>
