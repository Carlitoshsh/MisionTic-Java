package semana2.sesion3.claseAbstracta;

public class Programa {
    // Modificador de alcance
    public static void escribirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        Gato animal = new Gato();
        animal.comer();
        animal.emitirUnSonido();
        escribirMensaje("Hola");
    }
}
