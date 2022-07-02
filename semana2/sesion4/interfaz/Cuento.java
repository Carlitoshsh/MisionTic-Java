package semana2.sesion4.interfaz;

public interface Cuento {
    public void obtenerCuentos();

    default public void obtenerIntroduccion(){
        System.out.println("Cuentos de animales");
    }
}
