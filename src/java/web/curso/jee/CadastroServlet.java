/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.curso.jee;

import bd.jee.conexao.Dados;
import bd.jee.conexao.DadosDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Rubens
 */
@WebServlet("/Cadastro")
public class CadastroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Declara session
        HttpSession session = request.getSession(true);

        DadosDAO dao = new DadosDAO();
        Dados dado = new Dados();

        //Pega argumentos da página jsp
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String email = request.getParameter("email");

        //coloca valores para manipulae
        dado.setLogin(login);

        dado.setSenha(senha);

        dado.setEmail(email);

        //método para gravar do DAO
        dao.create(dado);
        //session para manipular os dados entre as páginas JSP
        session.setAttribute("ulogin", dado.getLogin());
        session.setAttribute("usenha", dado.getSenha());
        session.setAttribute("uemail", dado.getEmail());

        //Redireciona para outra página
        response.sendRedirect("resultado.jsp");
    }
}
