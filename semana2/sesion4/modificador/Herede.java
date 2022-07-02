package semana2.sesion4.modificador;

public class Herede {
    // operador de sellamiento: final
    // para el atributo nunca cambie su valor
    public final float PI = 3.1416f;

    public void saludar() {
        System.out.println("Hola");
    }

    // operador de sellamiento: final
    // para que no puedan sobreescribir este metodo
    public final void despedirse() {
        System.out.println("Adios");
    }
}
