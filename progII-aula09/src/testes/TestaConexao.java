package testes;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author prof-salu
 */
public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        
        System.out.println("Conexao aberta!");
        
        con.close();
        
        System.out.println("Conexao fechada!");
    }
}