package semana3.sesion1;

public class CajaGenerica<T> {
    public T caja;

    public CajaGenerica(T caja) {
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

    public T obtenerCaja() {
        return this.caja;
    }

    public static void main(String[] args) {
        CajaGenerica<String> caja = new CajaGenerica<String>("Hola");
        System.out.println(caja.decorar());
        System.out.println(caja.obtenerCaja().replace("H", "P"));
    
        CajaGenerica<Integer> caja2 = new CajaGenerica<Integer>(234);
        System.out.println(caja2.decorar());
        System.out.println(caja2.obtenerCaja().floatValue());

        CajaGenerica<Double> caja3 = new CajaGenerica<Double>(234.5);
        System.out.println(caja3.decorar());
        System.out.println(caja3.obtenerCaja().intValue());
    
    }

}
