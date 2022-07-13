package semana4.sesion2.dudas;

public class Perro {
    private String nombre;
    private int edad;

    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.setEdad(edad);
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}
