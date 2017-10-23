/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.jee.conexao;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author Rubens
 */
public final class Conexao {

    private Conexao() {
        PreparedStatement pstmt = null;
    }

    static {
        try {
            //Carrega o driver do banco
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do {banco }  nao encontrado.");
            System.exit(-1);
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/pos", "root", "");
        } catch (SQLException ex) {
            System.err.print("Erro ao obter conexao : " + ex.getMessage());
        }
        return conn;
    }

}
