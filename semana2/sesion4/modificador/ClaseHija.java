package semana2.sesion4.modificador;

public class ClaseHija extends Herede {
    // public void despedirse(){
    // System.out.println("Adios");
    // }

    public void saludar() {
        System.out.println("Hola clase hija");
    }

    public static void main(String[] args) {
        ClaseHija claseHija = new ClaseHija();
        claseHija.saludar();
        claseHija.despedirse();
    }
}
