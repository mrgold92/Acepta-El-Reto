package aceptaElReto;

import java.util.Scanner;

public class P151 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		while (numero != 0) {
			boolean nocumple = false;
			int[][] numeros = new int[numero][numero];

			for (int i = 0; i < numero; i++) {
				for (int j = 0; j < numero; j++) {
					numeros[i][j] = sc.nextInt();

				}
			}

			// comprobamos que la diagonal sea 1
			for (int i = 0; i < numero; i++) {
				for (int j = 0; j < numero; j++) {

					if (i == j) {
						if (numeros[i][i] != 1) {
							nocumple = true;
						}
					}else {
						if (numeros[i][j] != 0) {
							nocumple = true;
						}
					}

				}
			}

			System.out.println(nocumple ? "NO" : "SI");
			numero = sc.nextInt();
		}

	}
}
