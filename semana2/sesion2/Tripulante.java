package semana2.sesion2;

public class Tripulante {
    // Atributos
    private String nombre;
    private int edad;
    private String identificacion;
    private byte ciclo;
    private String[] profesiones;
    private int[] notasRetos;

    // Constructor
    public Tripulante(String _nombre, byte _ciclo, int[] _notas, int _edad) {
        this.nombre = _nombre;
        this.ciclo = _ciclo;
        this.notasRetos = _notas;
        this.edad = _edad;
    }

    // Metodos
    public double CalcularNota() {
        double nota = 0;
        for (int i = 0; i < this.notasRetos.length; i++) {
            nota += this.notasRetos[i];
        }
        return nota / this.notasRetos.length;
    }

    public static void edadMasAlta2(int edad1, int edad2) {
        if (edad1 > edad2) {
            System.out.println("La edad mas alta es: " + edad1);
        } else {
            System.out.println("La edad mas alta es: " + edad2);
        }
    }

    public String edadMasAlta(Tripulante otroTripulante) {
        if (this.edad > otroTripulante.edad) {
            return this.nombre;
        } else {
            return otroTripulante.nombre;
        }
    }

    public static void main(String[] args) {
        int[] notas = {1, 2, 3, 4, 5};
        Tripulante tripulante = new Tripulante("Juan", (byte)1, notas, 20);
        System.out.println(tripulante.CalcularNota());

        Tripulante tripulante2 = new Tripulante("Pedro", (byte)2, new int[]{5, 4, 5, 2, 5 }, 22);
        System.out.println(tripulante2.CalcularNota());

        System.out.println(tripulante.edadMasAlta(tripulante2));

        edadMasAlta2(19, 15);
    }
}
