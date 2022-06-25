package Semana1.sesion4;

public class ArgumentosEntrada {
    public static void main(String[] argumentos) {
        // Porque sucede:
        // https://stackoverflow.com/questions/12256238/why-cant-i-compare-command-line-arguments-like-other-string-arrays
        String texto = "Ahora todo el texto esta en mayusculas";
        String[] a = { "HOLA" };

        if(a[0] == "HOLA") {
            System.out.println("Imprime...");
            int num1 = 2;
            int num2 = 2;
            System.out.println(num1 == num2);
        }
        System.out.println(a[0] == "HOLA");
        System.out.println(a[0].equals("HOLA"));
        if (argumentos.length > 0) {
            System.out.println(argumentos[0]);
            if (argumentos[0] == "MAYUS") {
                System.out.println(texto.toUpperCase());
            } else {
                System.out.println(texto.toLowerCase());
            }
        } else {
            System.out.println("No ha definido configuracion");
        }
    }
}
