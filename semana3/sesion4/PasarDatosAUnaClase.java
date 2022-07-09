package semana3.sesion4;

import java.util.Scanner;
import java.util.ArrayList;

public class PasarDatosAUnaClase {
    public static void main(String[] args) {
        //Max,13
        //Lassie,2
        //Tony,3
        //0
        Scanner input = new Scanner(System.in);
        ArrayList<Perro> perros = new ArrayList<Perro>();
        // Inicia
        String datoIngresado = input.nextLine();
        // Condicion de parada
        while(!datoIngresado.equals("0")) {
            String[] datosPerro = datoIngresado.split(",");
            perros.add(new Perro(datosPerro[0], Integer.parseInt(datosPerro[1])));

            // Actualiza
            datoIngresado = input.nextLine();
        }

        System.out.println(perros);

        input.close();
    }
}
