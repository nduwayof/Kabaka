<%-- 
    Document   : testing
    Created on : Mar 5, 2015, 10:37:05 PM
    Author     : SULAIMAN
--%>
<jsp:useBean id="i" class="rw.djuma.Individual" scope="request">
    <jsp:setProperty name="i" property="*"/>    
</jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        i.save();
        response.sendRedirect("registration.jsp");
        %>
    </body>
    
</html>
