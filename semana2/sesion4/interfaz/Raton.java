package semana2.sesion4.interfaz;

public class Raton implements Animal, Cuento {
    public void emitirUnSonido() {
        System.out.println("Squeak");
    }

    public void dormir() {
        System.out.println("Dormiendo");
    }

    public void hibernar() {
        System.out.println("Hibernando");
    }

    public void obtenerCuentos() {
        System.out.println("Cuentos de ratones");
    }

    public void obtenerIntroduccion() {
        System.out.println("Cuento de raton ratonera");
    }
}
