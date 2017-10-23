<%-- 
    Document   : resultado
    Created on : 22/10/2017, 19:26:37
    Author     : Rubens
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
            String login = (String) session.getAttribute("ulogin");
            String senha = (String) session.getAttribute("usenha");
            String email = (String) session.getAttribute("uemail");
        %>
        <form>
            Login: :<br/><input type="text" name="codigo" value="<%= login%>" /><br/>
            Senha: :<br/><input type="text" name="nome" value="<%= senha%>" /><br/>
            E-mail:<br/><input type="text" name="idade" value="<%= email%>" /><br/>
        </form>
    </body>
</html>
