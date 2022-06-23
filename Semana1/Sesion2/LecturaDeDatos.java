package Semana1.Sesion2;
import java.util.Scanner;

public class LecturaDeDatos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        System.out.println(entrada);
        int numero = input.nextInt();
        System.out.println(numero);
        float flotante = input.nextFloat();
        System.out.println(flotante);
        int numero2 = Integer.parseInt(input.nextLine());
        System.out.println(numero2);
    }
}
