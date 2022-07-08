package semana3.sesion3.JUnit;

public class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }

    public int division(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }
}
