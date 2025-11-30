package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    // Configurações do Banco de Dados
    private static final String URL = "jdbc:mysql://localhost:3306/lonewolf";
    private static final String USER = "root"; // Altere para seu usuário
    private static final String PASSWORD = ""; // Altere para sua senha

    public static Connection getConnection() {
        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Estabelece a conexão
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC do MySQL não encontrado: " + e.getMessage());
            throw new RuntimeException("Erro ao carregar o driver do MySQL.", e);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            System.err.println("Verifique se o MySQL está rodando e se as credenciais (URL, USER, PASSWORD) estão corretas.");
            throw new RuntimeException("Erro de conexão com o banco de dados.", e);
        }
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }
}
