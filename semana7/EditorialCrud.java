package semana7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import semana7.Model.EditorialDAO;

public class EditorialCrud {
    String jdbcURL = "jdbc:mysql://localhost:3306/libreriagrupo41";
    String user = "root";
    String password = "Grupo41.";
    Connection conn;

    public EditorialCrud() throws SQLException{
        this.ConectarABaseDeDatos();
    }

    public void ConectarABaseDeDatos() throws SQLException {
        conn = DriverManager.getConnection(jdbcURL, user, password);
    }

    public void insertarBaseDeDatos(EditorialDAO eDao) throws SQLException {
        if (conn != null) {
            String sql = "INSERT INTO editorial(EditorialNombre,EditorialPais) values(?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, eDao.editorialNombre);
            statement.setString(2, eDao.editorialPais);
            int consulta = statement.executeUpdate();
            if(consulta > 0){
                System.out.println("Insert exitoso");
            }
        }
    }
            
}
