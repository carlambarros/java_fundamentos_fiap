package BD.design_patterns;

import java.sql.*;

// camada view: execução no console
public class TesteCrudDinamico {

    public static void main(String[] args) {

        try {

            Connection conexao = MercadoDbManager.obterConexao();

            System.out.println("Conectou ao banco");

            PreparedStatement pstmt = conexao.prepareStatement(
                    "INSERT INTO t_produto " + "(nm_produto, vl_produto, dt_validade) " + "VALUES (?, ?, ?)");

            pstmt.setString(1, "Pera"); // primeiro parametro (nome)
            pstmt.setFloat(2, 7); // segundo par. (valor)
            java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
            pstmt.setDate(3, data);
            pstmt.executeUpdate();

            pstmt = conexao.prepareStatement("UPDATE t_produto SET vl_produto = ? WHERE cd_produto = ?");
            pstmt.setFloat(1, 8);
            pstmt.setInt(2, 3);
            pstmt.executeUpdate();

            pstmt = conexao.prepareStatement("DELETE FROM t_produto WHERE cd_produto = ?");
            pstmt.setInt(1, 2);
            pstmt.executeUpdate();

            pstmt = conexao.prepareStatement("SELECT * FROM t_produto WHERE cod_produto = ?");
            pstmt.setInt(1, 3);
            ResultSet result = pstmt.executeQuery();

            while (result.next()) {

                // Recupera os valores de cada coluna e imprime no console
                System.out.println(result.getInt("cd_produto") + " " +
                        result.getString("nm_produto") + " " +
                        result.getDouble("vl_produto") + " " +
                        result.getDate("dt_validade"));
            }

            //Fecha a conexão
            conexao.close();

            // Tratamento de erro de conexão
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar no MYSQL");
            e.printStackTrace();

            // Tratamento de erro quando não encontrado o Driver do Mysql
        }
    }
}

