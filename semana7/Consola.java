package semana7;

import java.sql.SQLException;
import java.util.Scanner;

import semana7.Model.EditorialDAO;

/**
 * AUTORES:
 * - Carlos Gomez
 * - Mision TIC
 * 
 * VIDEO
 * - youtube (publico con el enlace)/drive (publico)
 * 
 * SUBIR TRABAJO A MOODLE
 */

public class Consola {
    private static void mostrarMenu() {
        System.out.println(
                "\n\n*************\n" +
                        "GRUPO 41\n" +
                        "*************\n" +
                        " Opciones: \n" +
                        "1.\tIngresar editorial \n" +
                        "2.\tIngresar libro \n" +
                        "3.\tSalir \n");
    }

    public static void main(String[] args) throws SQLException {
        mostrarMenu();
        Scanner in = new Scanner(System.in);
        int opcion = Integer.parseInt(in.nextLine());
        while (opcion != 3) {
            if (opcion == 1) {
                System.out.println("*** EDITORIAL ***");
                System.out.println("Ingrese nombre...");
                String nombre = in.nextLine();
                System.out.println("Ingrese pais...");
                String pais = in.nextLine();
                EditorialCrud editorial = new EditorialCrud();
                editorial.insertarBaseDeDatos(new EditorialDAO(nombre, pais));
            } else {
                System.out.println("*** LIBRO ***");
                System.out.println("Ingrese libro...");
            }
            mostrarMenu();
            opcion = Integer.parseInt(in.nextLine());
        }
        in.close();
    }

}
