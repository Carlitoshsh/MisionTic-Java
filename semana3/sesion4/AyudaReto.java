package semana3.sesion4;

import java.util.ArrayList;
import java.util.Scanner;

public class AyudaReto {
    static ArrayList<Perro> perros = new ArrayList<Perro>();

    public static void imprimirPerros() {
        System.out.println(perros);
    }

    public static void procesarOpciones(Scanner input) {
        String entrada = input.nextLine();
        while (!entrada.equals("0")) {
            if (entrada.equals("P")) {
                imprimirPerros();
            } else {
                String[] datosPerro = entrada.split(" ");
                perros.add(new Perro(datosPerro[0], Integer.parseInt(datosPerro[1])));
            }
            entrada = input.nextLine();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        procesarOpciones(input);
        input.close();
    }
}
