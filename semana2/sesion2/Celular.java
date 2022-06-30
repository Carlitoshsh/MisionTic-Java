package semana2.sesion2;

public class Celular {
    // Atributos
    public String marca;
    public String modelo;

    // Constructor (metodo)
    public Celular(String _marca, String _modelo) {
        this.marca = _marca;
        this.modelo = _modelo;
    }

    // Metodos (Comportamiento)
    public void llamar() {
        System.out.println(this.marca + " " + this.modelo + ": Llamando");
    }

    public void enviarMensaje() {
        System.out.println(this.marca + " " + this.modelo + ": Enviando mensaje");
    }

    public void marcaEsIgual(Celular otroCelular) {
        if (this.marca.equals(otroCelular.marca)) {
            System.out.println("La marca del celular es igual");
        } else {
            System.out.println("La marca del celular es diferente");
        }
    }

    public static void main(String[] args) {
        Celular motoE = new Celular("Motorola", "E6");
        Celular xiaomi = new Celular("Xiaomi", "Mi8");
        Celular iphone = new Celular("Apple", "iPhone X");
        Celular samsung = new Celular("Samsung", "S10");
        Celular motoG5 = new Celular("Motorola", "G5");

        samsung.llamar();
        xiaomi.enviarMensaje();
        motoE.marcaEsIgual(samsung);
    }

}
