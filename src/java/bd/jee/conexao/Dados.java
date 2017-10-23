/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.jee.conexao;

/**
 *
 * @author Rubens
 */
public class Dados {

    private int id_usuario;
    private String login;
    private String senha;
    private String email;

    public Dados() {
    }

    public Dados(int id_usuario, String login, String senha, String email) {
        this.id_usuario = id_usuario;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }
    
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
