package semana3.sesion2;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return "[ Nombre: " + this.nombre + "] de Edad: " + this.edad;
    }
}
