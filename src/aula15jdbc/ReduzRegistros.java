package aula15jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ReduzRegistros {
    public static void main(String[] args) throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/2016-3-dcc","usuario","senha");
            System.out.println("Conexao aberta com sucesso");
            Statement operacao = conexao.createStatement();
           // int n = operacao.executeUpdate("UPDATE produto SET qtd=qtd*0.9 WHERE qtd>300");
            int n = operacao.executeUpdate("DELETE from produto WHERE qtd<100");
            System.out.println(n + " registros alterados");
    }
}
