package semana2.sesion1;

public class Perro {
    // Atributos
    public String nombre;
    public String raza;
    public int edad;

    // Constructor
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Metodos
    public void ladrar() {
        System.out.println(this.nombre + ": Woof");
    }

    public void comer() {
        System.out.println("Comiendo");
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro("Toby", "Pitbull", 4);
        Perro miPerro2 = new Perro("jack", "labardor", 5);
        Perro otroPerro = new Perro("Firulais", "Golden", 3);
        Perro perro2 = new Perro("Manchu", "shitzu", 8);
        Perro miperro2 = new Perro("Luca", "criollo", 3);
        Perro miPerro20 = new Perro("lulu", "pinche", 6);
        Perro tuPerro = new Perro("kaiser", "crilolo", 5);
        miPerro.ladrar();
        tuPerro.ladrar();
        perro2.ladrar();
        miPerro20.ladrar();
        System.out.println(perro2.nombre);

    }

}
