package semana4.sesion1.proyectoClase;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TriquiFront extends JFrame {
    static TriquiFront triqui = new TriquiFront();
    static JButton[] btns = new JButton[9];

    public static void init() {
        triqui.setTitle("Triqui");
        triqui.setBounds(30, 30, 300, 300);
        triqui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        triqui.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            btns[i] = new JButton("🚀");
            triqui.add(btns[i]);
        }
        triqui.setVisible(true);
    }

    public static void main(String[] args) {
        init();
    }

}
