package semana4.sesion1.dudasReto;

public class Regular extends Jugador {
    public int minutosJugados;

    public Regular(String nombre, int edad, int minutosJugados) {
        super(nombre, edad);
        this.minutosJugados = minutosJugados;
    }

    public String toString() {
        return "Nombre: " + this.nombre + " Edad: " + this.edad + " Minutos jugados: " + this.minutosJugados;
    }
}
