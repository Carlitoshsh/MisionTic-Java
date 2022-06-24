package Semana1.sesion3;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese saldo Tarjeta SITP:");
        float saldoEnSitp = Float.parseFloat(input.nextLine());

        if (saldoEnSitp >= 2500){
            System.out.println("Puede entrar");
        } else if(saldoEnSitp < 0) {
            System.out.println("Usted nos debe!!!!");
        } else {
            System.out.println("Pidale a alguien que le venda el pasaje");
        }
    }
}
