package dao;

import connection.ConexaoMySQL;
import dto.vinhoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class vinhoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    // Método para cadastrar um novo vinho
    public void cadastrarVinho(vinhoDTO vinho) {
        String sql = "INSERT INTO vinhos (nome, ano, tipo) VALUES (?, ?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConexaoMySQL.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, vinho.getNome());
            stmt.setString(2, vinho.getAno());
            stmt.setString(3, vinho.getTipo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar vinho: " + e.getMessage());
        } finally {
            ConexaoMySQL.closeConnection(conn);
        }
    }

    // Método para listar todos os vinhos
    public List<vinhoDTO> listarVinhos() {
        String sql = "SELECT * FROM vinhos";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<vinhoDTO> listaVinhos = new ArrayList<>();

        try {
            conn = ConexaoMySQL.getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                vinhoDTO vinho = new vinhoDTO();

                vinho.setId(rs.getInt("id"));
                vinho.setNome(rs.getString("nome"));
                vinho.setAno(rs.getString("ano"));
                vinho.setTipo(rs.getString("tipo"));

                listaVinhos.add(vinho);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar vinhos: " + e.getMessage());
        } finally {
            ConexaoMySQL.closeConnection(conn);
        }
        return listaVinhos;
    }

    // READ - listar exemplares com filtro no título
    public List<vinhoDTO> listarVinhos(String filtro) {
        String sql = "SELECT * FROM vinhos WHERE nome LIKE ? ORDER BY titulo ASC";
        Connection conn = null;
        PreparedStatement pstm = null;
        List<vinhoDTO> lista = new ArrayList<>();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + filtro + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                vinhoDTO obj = new vinhoDTO();
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("Nome"));
                obj.setAno(rs.getString("Ano"));
                obj.setTipo(rs.getString("Tipo"));
                lista.add(obj);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        }
        return lista;
    }

    // Método para atualizar um vinho
    public void atualizarVinho(vinhoDTO vinho) {
        String sql = "UPDATE vinhos SET nome = ?, ano = ?, tipo = ? WHERE id = ?";
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConexaoMySQL.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, vinho.getNome());
            stmt.setString(2, vinho.getAno());
            stmt.setString(3, vinho.getTipo());
            stmt.setInt(4, vinho.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar vinho: " + e.getMessage());
        } finally {
            ConexaoMySQL.closeConnection(conn);
        }
    }

    // Método para excluir um vinho
    public void excluirVinho(int id) {
        String sql = "DELETE FROM vinhos WHERE id = ?";
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = ConexaoMySQL.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao excluir vinho: " + e.getMessage());
        } finally {
            ConexaoMySQL.closeConnection(conn);
        }
    }
}
