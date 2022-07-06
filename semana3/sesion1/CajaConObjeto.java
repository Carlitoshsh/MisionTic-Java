package semana3.sesion1;

public class CajaConObjeto {
    public Object caja;

    public CajaConObjeto(Object caja) {
        this.caja = caja;
    }

    public String decorar() {
        String s = "" + this.caja;
        String simbolo = "*";
        String linea = simbolo;
        for (int i = 0; i <= s.length(); i++) {
            linea += simbolo;
        }
        return linea + "\n" +
                simbolo + s + simbolo +
                "\n" + linea;
    }

    public Object obtenerCaja() {
        return this.caja;
    }

    public static void main(String[] args) {
        CajaConObjeto miCaja = new CajaConObjeto("Hola");
        System.out.println(miCaja.decorar());
        System.out.println(((String) miCaja.obtenerCaja())
                .replace("H", "P"));

        CajaConObjeto miCaja2 = new CajaConObjeto(234);
        System.out.println(miCaja2.decorar());
        System.out.println(((Integer) miCaja2.obtenerCaja())
                .floatValue());
    }
}
