package BD;

import java.sql.*;

public class TesteConexao {

    public static void main(String[] args) {

        try {
            // Define o driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Interface JDBC cuja implementação DriveManager abre uma conexão com
            // a URL definida para acesso ao banco
            Connection conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/fiap",
                    "root",
                    "1234"
            );

            System.out.println("Conectado com sucesso!");

            PreparedStatement pstmt;

//            pstmt.setString(1, "Pera"); // Primeiro parametro (nome)
//            pstmt.setFloat(2, 7); // Segundo parâmetro (valor)
//            java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
//            pstmt.setDate(3, data); // Terceiro parametro (data de validade)
//            pstmt.executeUpdate();

//            pstmt = conexao.prepareStatement(
//                    "UPDATE t_produto SET vl_produto = ? WHERE cd_produto = ?");
//            pstmt.setFloat(1, 8); // Primeiro parametro (valor)
//            pstmt.setInt(2, 3); // segundo parametro (codigo)
//            pstmt.executeUpdate();

//            pstmt = conexao.prepareStatement("DELETE FROM t_produto WHERE cd_produto = ?");
//            pstmt.setInt(1, 2); //primeiro parametro (codigo)
//            pstmt.executeUpdate();

            CallableStatement cs = conexao.prepareCall("{call sp_insertion_produto(?, ?, ?)}");
            cs.setString(1, "Morango"); //primeiro parametro (nome)
            java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
            cs.setFloat(2, 10); // segundo par. (valor)
            cs.setDate(3, data); // terceiro par. (data validade)
            cs.executeUpdate();

            pstmt = conexao.prepareStatement("SELECT * FROM t_produto WHERE cd_produto = ?");
            pstmt.setInt(1, 3); // primeiro parametro (codigo)
            ResultSet result = pstmt.executeQuery();

//            // Percorre todos os registros encontrados
            while (result.next()) {

                // Recupera os valores de cada coluna e imprime no console
                System.out.println( result.getInt("cd_produto") + " " +
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
        } catch (ClassNotFoundException e) {
            System.err.println("O driver JDBC não foi encontrado!");
            e.printStackTrace();
        }
    }
}
