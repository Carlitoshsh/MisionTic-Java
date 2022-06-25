package Semana1.sesion4;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// Punto flotante
		// https://betterprogramming.pub/why-is-0-1-0-2-not-equal-to-0-3-in-most-programming-languages-99432310d476
		System.out.println(0.1f + 0.2f);

		// En Python:
		// arreglo = [1,2,3,4,5]
		String cadena = "Hola";
		int[] arreglo = { 1, 2, 3, 4, 5 };
		String[] frutas = { "banana", "fresa", "mango" };

		System.out.println(cadena.length());
		System.out.println(arreglo.length);
		System.out.println(frutas.length);
		System.out.println(frutas[2]);

		// Matriz llena de ceros de tamanio 2x2
		int[][] d2Array = new int[2][2];

		// Matriz previamente inicializada
		int[][] ejemplo2 = {
			{1, 2},
			{3, 5}
		};

		d2Array[0][1] = 8;
		System.out.println(Arrays.deepToString(d2Array));
		System.out.println(Arrays.deepToString(ejemplo2));

		// Foreach
		for(int[] fila: ejemplo2){
			System.out.println(Arrays.toString(fila));
			for(int valor: fila) {
				System.out.println("Valor " + valor);
			}
		}

		// For clasico
		// i -> para las filas
		// j -> para las columnas
		for (int i = 0; i < ejemplo2.length; i++) {
			for (int j = 0; j < ejemplo2[i].length; j++) {
				System.out.println("["+i+","+j+"] = "+ejemplo2[i][j]);
			}
		}


	}
}