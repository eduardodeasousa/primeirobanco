package aula15jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsereRegistro {
    public static void main(String[] args) throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/2016-3-dcc","usuario","senha");
            System.out.println("Conexao aberta com sucesso");
            Statement operacao = conexao.createStatement();
            operacao.executeUpdate("INSERT INTO produto VALUES ('Borracha', 123, CURRENT_TIMESTAMP)");
    }
}
