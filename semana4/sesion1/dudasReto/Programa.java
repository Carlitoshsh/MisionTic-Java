package semana4.sesion1.dudasReto;

import java.util.ArrayList;

public class Programa {

    public static ArrayList<Jugador> crearLista() {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = crearLista();
        jugadores.add(new Cedido("Juan", 23, "Inter"));
        jugadores.add(new Regular("Pedro", 20, 220));
        System.out.println(jugadores);

        // ArrayList<ArrayList<ArrayList<String>>> hola = new ArrayList<>();
        // hola.add(new ArrayList<>());
    }

}
