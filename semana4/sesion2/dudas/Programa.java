package semana4.sesion2.dudas;

public class Programa {
    public static void main(String[] args) {
        Perro perro = new Perro("Tony", 3);
        perro.setEdad(10);
        
        // perro.edad = -1;
        System.out.println(perro.getEdad());
    }
}
