<%-- 
    Document   : cadastro
    Created on : 22/10/2017, 19:15:22
    Author     : Rubens
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Web</title>
    </head>
    <body>
        <FORM action="Cadastro" method="post">
            <TABLE style="background-color: #95BB85;" WIDTH="40%" >
                <TR>
                    <TH width="50%">Usuário:</TH>
                    <TD width="50%"><INPUT NAME="login" TYPE="text" maxlength="10" size="20%"></TD>
                </tr>
                <TR>
                    <TH width="50%">Senha:</TH>
                    <TD width="50%"><INPUT NAME="senha" TYPE="password" maxlength="10" size="20%"></
                        TD>
                </tr>
                <TR>
                    <TH width="50%">E-mail:</TH>
                    <TD width="50%"><INPUT NAME="email" TYPE="text" maxlength="30" size="50%"></TD>
                </tr>
                <TD width="50%"><INPUT TYPE="submit" VALUE="Cadastrar" ></TD> </tr>
            </TABLE>
        </FORM>
    </body>
</html>
