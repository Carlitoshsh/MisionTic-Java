package semana4.sesion1.dudasReto;

public class Cedido extends Jugador {
    public String clubDestino;

    public Cedido(String nombre, int edad, String clubDestino) {
        super(nombre, edad);
        this.clubDestino = clubDestino;
    }

    public String toString() {
        return "Nombre: " + this.nombre + " Edad: " + this.edad + " Club: " + this.clubDestino;
    }
}
