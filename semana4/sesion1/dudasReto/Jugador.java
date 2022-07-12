package semana4.sesion1.dudasReto;

public class Jugador {
    public String nombre;
    public int edad;

    public Jugador(String _nombre, int _edad) {
        this.nombre = _nombre;
        this.edad = _edad;
    }

    public String toString() {
        return "Nombre: " + this.nombre + " Edad: " + this.edad;
    }
}