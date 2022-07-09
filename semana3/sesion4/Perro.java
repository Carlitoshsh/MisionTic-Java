package semana3.sesion4;

public class Perro {
    public String nombre;
    public int edad;

    public Perro(String _nombre, int _edad) {
        this.nombre = _nombre;
        this.edad = _edad;
    }

    @Override
    public String toString() {
        return "\n\tPerro llamado " + this.nombre +
                " de edad " + this.edad + "\n";
    }
}
