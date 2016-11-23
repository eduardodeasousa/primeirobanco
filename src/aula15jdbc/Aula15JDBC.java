package aula15jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Aula15JDBC {

    public static void main(String[] args) {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("Driver disponivel");
        }
        catch (ClassNotFoundException e)
        {
            System.err.println("Driver nao disponivel");
            e.printStackTrace(System.err);
        }
        try {
            Connection conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/2016-3-dcc","usuario","senha");
            System.out.println("Conexao aberta com sucesso");
            Statement operacao = conexao.createStatement();
            operacao.executeUpdate("CREATE TABLE produto("
                     +"nome VARCHAR(255),"
                     +" qtd INTEGER,"
                     +" atualizado TIMESTAMP"+")");
            
        } catch (SQLException ex) {
            System.err.println("Problemas ao abrir a conexao com o SGBD");
            Logger.getLogger(Aula15JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
