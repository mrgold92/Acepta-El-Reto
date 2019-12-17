package aceptaElReto;

import java.util.Scanner;

public class P151 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		while (numero != 0) {
			boolean si = true;
			int[][] numeros = new int[numero][numero];

			for (int i = 0; i < numero; i++) {
				for (int j = 0; j < numero; j++) {
					numeros[i][j] = sc.nextInt();

				}
			}

			// comprobamos que la diagonal sea 1
			for (int i = 0; i < numero; i++) {
				for (int j = 0; j < numero; j++) {
					if (numeros[i][i] != 1) {
						si = false;
						break;
					}
				}
			}

			// comprobamos que todos los demás sean 0
			for (int i = 0; i < numero; i++) {
				for (int j = 0; j < i; j++) {
					if (numeros[i][j] != 0) {
						si = false;
						break;
					}
				}
			}

			// comprobamos la diagonal empezando por la derecha
			if (si) {
				for (int i = 0; i < numero; i++) {
					for (int j = numero - 1; j > i; j--) {
						if (numeros[i][j] != 0) {
							si = false;
							break;
						}
					}
				}
			}
			System.out.println(si ? "SI" : "NO");
			numero = sc.nextInt();
		}

	}
}
