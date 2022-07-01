package semana2.sesion3;

public class Programa {

    public static void main(String[] args) {
        Tutor tutor = new Tutor("Juan", 1022, 20);
        tutor.saludar();
        float[] notas = {4.5f, 2.3f, 3.8f, 4, 5};
        Tripulante tripulante = new Tripulante("Pedro", 1023, 30, (byte)1, notas);
        tripulante.saludar();
        tripulante.saludar("Santiago");
        tripulante.saludarComoPersona();
        tutor.despedirse();
    }
}
