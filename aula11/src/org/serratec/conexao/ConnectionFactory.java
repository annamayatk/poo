package org.serratec.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String url = "jdbc:postgresql://localhost:5432/POO";  // Nome do banco correto
    private String username = "postgres";  // Usuário padrão do PostgreSQL
    private String password = "postgres";  // Senha padrão

    public Connection getConnection() {
        System.out.println("Fazendo a conexão....");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conectado com sucesso!");
        } catch (SQLException e) {
            // Aqui você pode ver o erro completo para entender o que está acontecendo
            System.err.println("Erro ao conectar:");
            e.printStackTrace();  // Vai imprimir o erro detalhado no console
        }
        return connection;
    }

    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.getConnection();
    }
}
