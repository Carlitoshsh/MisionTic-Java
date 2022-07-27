package semana6;

public class Editorial {
    public int idEditorial;
    public String editorialNombre;
    public String editorialPais;

    public Editorial(String editorialNombre, String editorialPais) {
        this.editorialNombre = editorialNombre;
        this.editorialPais = editorialPais;
    }

    public Editorial(int idEditorial, String editorialNombre) {
        this.idEditorial = idEditorial;
        this.editorialNombre = editorialNombre;
    }

}
