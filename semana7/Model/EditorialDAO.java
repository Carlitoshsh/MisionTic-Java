package semana7.Model;

// DAO -> Data Access Object
// Tabla -> Clase
public class EditorialDAO {
    public int idEditorial;
    public String editorialNombre;
    public String editorialPais;

    public EditorialDAO(int id, String nombre, String pais) {
        this.idEditorial = id;
        this.editorialNombre = nombre;
        this.editorialPais = pais;
    }

    public EditorialDAO(String nombre, String pais){
        this.editorialNombre = nombre;
        this.editorialPais = pais;
    }
}
