package semana2.sesion3;

public class Tripulante extends Persona {
    public byte ciclo;
    public float[] notas;

    public Tripulante(String nombre, int id, int edad, byte ciclo, float[] notas) {
        super(nombre, id, edad);
        this.ciclo = ciclo;
        this.notas = notas;
    }

    // @Override
    public void saludar() {
        System.out.println("Hola, soy el tripulante " + this.nombre +
                " y estoy en el ciclo " + this.ciclo);
    }

    public void saludar(String nombre) {
        System.out.println(this.nombre + ": Hola  " + nombre + ", ¿como estas?");
    }

    public void saludarComoPersona() {
        super.saludar();
    }

}
