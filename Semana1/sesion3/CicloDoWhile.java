package Semana1.sesion3;

public class CicloDoWhile {
    public static void main(String[] args) {
        double xi = 1.0;
        double x0;
        do {
            x0 = xi;
            xi = x0/2;
        } while(xi > 0.0);
        System.out.println(x0);
    }
}
