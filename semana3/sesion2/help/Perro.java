package semana3.sesion2.help;

public class Perro extends Animal {
    public String raza;

    public Perro(String nombre, int edad, String color, String raza) {
        super(nombre, edad, color);
        this.raza = raza;
    }

    public String toString(){
        return super.toString() + ", soy un perro de raza: "+ this.raza;
    }
    
}
