package semana3.sesion2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListaEncadenada {
    public static void main(String[] args) {
        LinkedList<String> frutas = new LinkedList<String>();
        frutas.add("Guayaba");
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Naranja");
        System.out.println(frutas.size());
        frutas.addLast("Coco");
        System.out.println(frutas.getLast());
        // Convertir un linkedlist a arraylist
        ArrayList<String> frutas2 = new ArrayList<String>(frutas);
        System.out.println(frutas2.size());
        frutas2.add("Mandarina");
        System.out.println(frutas2.size());
    }
}
