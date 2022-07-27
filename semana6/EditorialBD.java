package semana6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EditorialBD implements OperacionesSQL<Editorial, Integer> {
    String jdbcURL = "jdbc:mysql://localhost:3306/libreriagrupo41";
    String user = "root";
    String password = "Grupo41.";

    @Override
    public void Insertar(Editorial objeto) {
        try {
            Connection conn = DriverManager.getConnection(jdbcURL, user, password);
            if (conn != null) {
                String sqlComando = "INSERT INTO editorial (EditorialNombre, EditorialPais) values(?, ?)";
                PreparedStatement instruccionSql = conn.prepareStatement(sqlComando);
                instruccionSql.setString(1, objeto.editorialNombre);
                instruccionSql.setString(2, objeto.editorialPais);
                int columnasAfectadas = instruccionSql.executeUpdate();
                if (columnasAfectadas > 0) {
                    System.out.println("Insert exitoso");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void Actualizar(Editorial objetoActualizar) {
        try {
            Connection conn = DriverManager.getConnection(jdbcURL, user, password);
            if (conn != null) {
                String sqlComando = "UPDATE editorial SET EditorialNombre = ? WHERE idEditorial = ?";
                PreparedStatement instruccionSql = conn.prepareStatement(sqlComando);
                instruccionSql.setString(1, objetoActualizar.editorialNombre);
                instruccionSql.setInt(2, objetoActualizar.idEditorial);
                int columnasAfectadas = instruccionSql.executeUpdate();
                if (columnasAfectadas > 0) {
                    System.out.println("Update exitoso");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void Obtener(Integer id) {
        try {
            Connection conn = DriverManager.getConnection(jdbcURL, user, password);
            if (conn != null) {
                String sqlComando = "SELECT * FROM editorial";
                // String sqlComando = "SELECT * FROM editorial where idEditorial = ?";
                PreparedStatement instruccionSql = conn.prepareStatement(sqlComando);
                // instruccionSql.setInt(1, id);
                ResultSet resultados = instruccionSql.executeQuery();
                while (resultados.next()) {
                    System.out.println(
                            resultados.getInt(1) + " "
                                    + resultados.getString(2) + " " +
                                    resultados.getString(3));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void Borrar(Integer id) {
        try {
            Connection conn = DriverManager.getConnection(jdbcURL, user, password);
            if (conn != null) {
                String sqlComando = "DELETE FROM editorial where idEditorial = ?";
                PreparedStatement instruccionSql = conn.prepareStatement(sqlComando);
                instruccionSql.setInt(1, id);
                int columnasAfectadas = instruccionSql.executeUpdate();
                if (columnasAfectadas > 0) {
                    System.out.println("Delete exitoso");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        EditorialBD editorialBD = new EditorialBD();
        ArrayList<Editorial> editoriales = new ArrayList<>();
        editoriales.add(new Editorial("G&G", "Peru"));
        editoriales.add(new Editorial("Doomies", "USA"));
        editoriales.add(new Editorial("Antofagasta", "Venezuela"));
        editoriales.add(new Editorial("El Metro", "Colombia"));
        editoriales.add(new Editorial("Tacos", "Mexico"));
        // for (Editorial editorial : editoriales) {
        // editorialBD.Insertar(editorial);
        // }
        Editorial aActualizar = new Editorial(5, "Norma");
        editorialBD.Actualizar(aActualizar);
        editorialBD.Borrar(544);
        editorialBD.Obtener(5);
    }

}
