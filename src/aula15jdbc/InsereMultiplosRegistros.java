package aula15jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class InsereMultiplosRegistros {
    public static void main(String[] args) throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/2016-3-dcc","usuario","senha");
            System.out.println("Conexao aberta com sucesso");
            Statement operacao = conexao.createStatement();
            Random rnd = new Random();
            for (int i=0;i<10;i++) {
              operacao.executeUpdate("INSERT INTO produto VALUES ('Produto "
                      + rnd.nextInt(100)  + "', "
                      + rnd.nextInt(500)+ ", CURRENT_TIMESTAMP)");  
            }
            
    }
}
