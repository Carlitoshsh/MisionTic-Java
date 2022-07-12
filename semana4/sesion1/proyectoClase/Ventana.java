package semana4.sesion1.proyectoClase;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana {
    static JFrame miVentana = new JFrame();

    public static void main(String[] args) {
        JLabel label = new JLabel("Hola, soy Carlos!");
        miVentana.add(label);
        miVentana.setTitle("Esta es mi ventana");
        miVentana.setResizable(false);
        miVentana.setBounds(20, 20, 500, 200);
        miVentana.setVisible(true);
    }

}
