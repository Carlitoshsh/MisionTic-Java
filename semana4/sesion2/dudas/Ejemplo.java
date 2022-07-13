package semana4.sesion2.dudas;

public class Ejemplo {
    static int numero = 2;

    public static int sumar(int a, int b) {
        numero += 2;
        return a + b;
    }

    public static void saludar(String nombre, int otroNumero) {
        System.out.println("Hola soy " + nombre);
        numero = 5;
        otroNumero += 3;
    }

    public static void main(String[] args) {
        int numero2 = 4;
        saludar("Juan", numero2);
        System.out.println(numero2);
        int resultado = sumar(5, 10);
        System.out.println(resultado);
        System.out.println(numero);
    }
}
