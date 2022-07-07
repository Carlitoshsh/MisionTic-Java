package semana3.sesion2.help;

import java.util.ArrayList;

public class Programa {
    static ArrayList<Perro> perros = new ArrayList<Perro>();
    public static void main(String[] args) {
        Perro perro = new Perro("Tony", 2, "rojo", "pitbull");
        Perro perro2 = new Perro("Clifford", 1, "red", "labrador");
        perros.add(perro);
        perros.add(perro2);

        for(Perro dog: perros){
            System.out.println(dog.toString());
        }

    }
}
