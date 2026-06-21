package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/loja_jdbc";
        String usuario = "postgres";
        String senha = "1234";

        try (Connection conn = DriverManager.getConnection(url, usuario, senha)) {
            System.out.println("Conectado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados:");
            e.printStackTrace();
        }
    }
}