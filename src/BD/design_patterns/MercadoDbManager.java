package BD.design_patterns;

import java.sql.Connection;
import java.sql.DriverManager;

public class MercadoDbManager {

    public static Connection obterConexao() {
        Connection conexao = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/fiap",
                    "root",
                    "1234");

            } catch (Exception e) {
                e.printStackTrace();
        }
        return conexao;
    }
}
