package semana3.sesion2.help;

public class Animal {
    public String nombre;
    public int edad;
    public String color;

    public Animal(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public String toString() {
        return "\n-Nombre: " + this.nombre +
                " \n-Edad: " + this.edad +
                " \n-Color: " + this.color;
    }
}
