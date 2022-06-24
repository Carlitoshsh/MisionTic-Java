package Semana1.sesion3;

import java.lang.Math;

public class Funciones {

    static double elevarAlCuadrado(int n) {
        return Math.pow(n, 2.0);
    }

    static void saludar() {
        System.out.println("Hola 😊");
    }

    public static void main(String[] args) {
        double resultado = elevarAlCuadrado(5);
        saludar();
        System.out.println(resultado);
    }
}