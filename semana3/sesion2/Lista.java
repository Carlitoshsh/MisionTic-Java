package semana3.sesion2;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("Guayaba");
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Naranja");
        frutas.add("Sandia");
        frutas.add("Mango");
        frutas.add("Ciruela");
        frutas.add("Papaya");
        frutas.add("Uva");
        frutas.add("Fresa");
        frutas.add("Melon");
        frutas.add("Pina");
        frutas.add("Coco");
        System.out.println(frutas.size());
        frutas.add(0, "Mandarina");
        frutas.set(5, "Limon");
        System.out.println(frutas.get(5));
        System.out.println(frutas.indexOf("Manzana"));
        System.out.println(frutas.contains("Manzana"));
        System.out.println(frutas.isEmpty());
        frutas.remove(frutas.size()-1);
        System.out.println(frutas.size());
        frutas.remove("Coco");
        System.out.println(frutas.size());
        frutas.clear();
        System.out.println(frutas.size());
        // frutas.addlast
    }
}
