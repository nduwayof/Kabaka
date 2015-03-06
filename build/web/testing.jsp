<%-- 
    Document   : testing
    Created on : Mar 6, 2015, 12:08:24 AM
    Author     : SULAIMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
     String info=(String)session.getAttribute("info");
     String error=(String)session.getAttribute("error");
     out.println(info+"  "+error);

     %>
    </body>
</html>
