/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.jee.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rubens
 */
public class DadosDAO {

    private static DadosDAO instance;

    static {
        instance = new DadosDAO();
    }

    public DadosDAO() {
    }

    public static DadosDAO getInstance() {
        return instance;
    }

    public Dados read(Dados dados) {
        Dados dadosAux = new Dados();
        Connection conn = Conexao.getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE id_usuario = " + dados.getId_usuario());
            if (rs.next()) {
                dadosAux = carregaDados(dados, rs);
            } else {
                dadosAux = null;
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return dadosAux;
    }

    private Dados carregaDados(Dados dados, ResultSet rs) throws SQLException {
        Dados dadosAux = new Dados();
        dadosAux.setId_usuario(rs.getInt("Id_usuario"));
        dadosAux.setLogin(rs.getString("login"));
        dadosAux.setSenha(rs.getString("senha"));
        dadosAux.setEmail(rs.getString("email"));

        return dadosAux;
    }

    public boolean delete(Dados dados) {
        boolean retorno = true;
        Connection conn = Conexao.getConnection();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM users WHERE id_usuario = " + dados.getId_usuario());
            conn.close();
        } catch (SQLException ex) {
            retorno = false;
            ex.printStackTrace();
        }
        return retorno;
    }

    public boolean create(Dados dados) {
        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        boolean retorno = true;
        try {
            pstmt = conn.prepareStatement("INSERT INTO users (id_usuario, login, senha, email) VALUES (?, ?, ?, ?)");

            pstmt.setInt(1, dados.getId_usuario());
            pstmt.setString(2, dados.getLogin());
            pstmt.setString(3, dados.getSenha());
            pstmt.setString(4, dados.getEmail());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            retorno = false;
            ex.printStackTrace();
        }
        return retorno;
    }

    public boolean update(Dados dados) {
        boolean retorno = true;
        Connection conn = Conexao.getConnection();
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement( "UPDATE users SET " + "nome=?, idade = ? " + "WHERE codigo = ?");
            pstmt.setInt(1,  dados.getId_usuario());
            pstmt.setString(2, dados.getLogin());
            pstmt.setString(3, dados.getSenha());
            pstmt.setString(4, dados.getEmail());
            pstmt.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            retorno = false;
            ex.printStackTrace();
        }
        return retorno;
    }

}
