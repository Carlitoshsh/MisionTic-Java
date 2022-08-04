package semana8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

/*
 * 
 * Tabla de SQL
    create table seguimiento(
        id int auto_increment primary key,
        fecha datetime not null
    );
 */

public class ConexionSql {
    public static void main(String[] args) throws SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3306/libreriagrupo41";
        String user = "root";
        String password = "Grupo41.";

        // Dato de tipo LocalDate: funciona en Java 8
        LocalDateTime localDate = LocalDateTime.now();
        String fechaFormateada = localDate.toString();
        
        Connection conn = DriverManager.getConnection(jdbcURL, user, password);
        if (conn != null) {
            System.out.println("Conectado!");
            String sql = "INSERT INTO seguimiento(fecha) VALUES (?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            // Tener en cuenta que el formato de fecha debe ser yyyy-MM-dd hh:mm:ss
            statement.setString(1, fechaFormateada);
            int columnasAfectadas = statement.executeUpdate();
            if(columnasAfectadas > 0) {
                System.out.println("Se inserto el dato");
            }
        }
    }
}
