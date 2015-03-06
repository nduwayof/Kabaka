<%-- 
    Document   : processing
    Created on : Mar 6, 2015, 12:02:01 AM
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
        <%
         
        i.save();
        %>
    </body>
</html>
