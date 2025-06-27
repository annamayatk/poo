package org.serratec.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) {
        // URL do banco, usuário e senha (alterar conforme necessário)
        String url = "jdbc:postgresql://localhost:5432/POO";
        String usuario = "postgres";
        String senha = "postgres";

        try {
            System.out.println("Tentando conectar ao banco...");
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado com sucesso!");
            conexao.close();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
            e.printStackTrace();  // Exibe mais detalhes sobre o erro
        }
    }
}
