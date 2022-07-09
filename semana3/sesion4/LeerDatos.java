package semana3.sesion4;

import java.util.Scanner;
import java.util.ArrayList;

public class LeerDatos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una lista de notas usando punto, separadas por coma.");
        // 3.4,5.0,4.8,1,2.8
        String entrada = input.nextLine();
        String[] arregloNotas = entrada.split(",");
        ArrayList<Double> listaNotas = new ArrayList<Double>();

        for (String notaEnString : arregloNotas) {
            listaNotas.add(Double.parseDouble(notaEnString));
        }

        Double suma = 0.0;
        for (Double nota : listaNotas) {
            suma += nota;
        }
        Double promedio = suma / listaNotas.size();
        System.out.println(promedio);
        input.close();
    }
}
