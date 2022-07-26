package semana6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/libreriagrupo41";
        String user = "root";
        String password = "Grupo41.";
        try {
            Connection conn = DriverManager.getConnection(jdbcURL, user, password);
            if (conn != null) {
                System.out.println("Conectado!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
