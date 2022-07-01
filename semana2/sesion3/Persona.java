package semana2.sesion3;

public class Persona {
    public String nombre;
    public int id;
    public int edad;

    public Persona(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    public void despedirse() {
        System.out.println("Chao, me voy. Att: " + this.nombre);
    }

    public void saludar() {
        System.out.println("Hola, me llamo " + this.nombre);
    }
}
