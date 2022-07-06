package semana3.sesion1;

public class CajaDespues {

    public String decorar(Object n) {
        String s = "" + n;
        String simbolo = "*";
        String linea = simbolo;
        for (int i = 0; i <= s.length(); i++) {
            linea += simbolo;
        }
        return linea + "\n" +
                simbolo + s + simbolo +
                "\n" + linea;
    }

    public static void main(String[] args) {
        CajaDespues caja = new CajaDespues();
        System.out.println(caja.decorar(234));
        System.out.println(caja.decorar(234.5f));
        System.out.println(caja.decorar("Hola"));
    }
}
