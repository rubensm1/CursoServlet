<%-- 
    Document   : outra
    Created on : 21/10/2017, 17:49:37
    Author     : Rubens
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Insert title here</title>
    </head>
    <body>
        <%
            if (request.getParameter("nome") == null) {
                out.println("Olá Java");
            } else {
                out.println("olá, " + request.getParameter("nome"));
            }
        %>
    </body>
</html>