package semana4.sesion1.proyectoClase;

public class Triqui {
    static char[][] triqui = new char[3][3];

    public static void construirTriqui() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                triqui[i][j] = '_';
            }
        }
    }

    public static void imprimirTriqui() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(triqui[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void jugar(int x, int y, char jugador) {
        triqui[x][y] = jugador;
        if(ganador(jugador)) {
            System.out.println("El jugador " + jugador + " ganó");
        }
    }

    private static boolean ganador(char jugador) {
        for (int i = 0; i < 3; i++) {
            if(triqui[i][0] == jugador && triqui[i][1] == jugador && triqui[i][2] == jugador) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if(triqui[0][i] == jugador && triqui[1][i] == jugador && triqui[2][i] == jugador) {
                return true;
            }
        }
        if(triqui[0][0] == jugador && triqui[1][1] == jugador && triqui[2][2] == jugador) {
            return true;
        }
        if(triqui[0][2] == jugador && triqui[1][1] == jugador && triqui[2][0] == jugador) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        construirTriqui();
        imprimirTriqui();
        jugar(0, 0, 'X');
        imprimirTriqui();
    }
}
