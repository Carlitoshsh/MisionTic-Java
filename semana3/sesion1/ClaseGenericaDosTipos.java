package semana3.sesion1;

public class ClaseGenericaDosTipos<K, V> {
    public K llave;
    public V valor;

    public ClaseGenericaDosTipos(K llave, V valor) {
        this.llave = llave;
        this.valor = valor;
    }

    public K obtenerLlave() {
        return this.llave;
    }

    public V obtenerValor() {
        return this.valor;
    }

    public static void main(String[] args) {
        ClaseGenericaDosTipos<Integer, String> ejemplo = 
            new ClaseGenericaDosTipos<Integer,String>(10111, "Carlos");
        System.out.println(ejemplo.obtenerLlave());
        System.out.println(ejemplo.obtenerValor());
    }
}
