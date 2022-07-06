package semana3.sesion1;

public class CajaAntes {
    // Se repite codigo en todos los metodos decorar

    public String decorar(int n) {
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

    public String decorar(float n) {
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

    public String decorar(String n) {
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
        CajaAntes c = new CajaAntes();
        System.out.println(c.decorar(234));
        System.out.println(c.decorar(234.5f));
        System.out.println(c.decorar("Hola"));
    }
}
