package semana3.sesion3;

public class Prueba {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int resultado = suma(2, 3);
        int resultadoEsperado = 5;
        if(resultado == resultadoEsperado) {
            System.out.println("Prueba exitosa");
        } else {
            System.out.println("Prueba fallida");
        }

        // int resultado2 = division(2, 0);
        // int resultadoEsperado2 = 0;
        // if(resultado2 == resultadoEsperado2) {
        //     System.out.println("Prueba exitosa");
        // } else {
        //     System.out.println("Prueba fallida");
        // }
    }
}
