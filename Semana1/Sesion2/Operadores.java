package Semana1.Sesion2;
public class Operadores {
    // Este es un comentario. 
    public static void main(String[] args) {
        int suma;
        suma = 5 + 7;
        double division = (float) suma / 9;
        double divisionEntera = suma / 9;
        long multiplicacion = 3425 * (-234324);
        int modulo = 23 % 10;
        suma = 234;
        suma += 2;
        ++suma;
        suma++;
        System.out.println((float) suma);
        System.out.println(division);
        System.out.println(divisionEntera);
        System.out.println(multiplicacion);
        System.out.println(modulo);

        if (suma != 238 && !(suma < 0) || division < 1) {
            System.out.println("Si, cumple");
        } else {
            System.out.println("No cumple");
        }
    }
}
