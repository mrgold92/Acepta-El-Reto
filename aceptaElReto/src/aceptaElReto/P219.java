package aceptaElReto;

import java.util.Scanner;

public class P219 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();

		for (int i = 0; i < casos; i++) {
			int decimos = sc.nextInt();
			int[] numeros = new int[decimos];
			int s = 0;
			for (int j = 0; j < numeros.length; j++) {
				numeros[j] = sc.nextInt();
			}

			for (int deci : numeros) {
				if (deci % 2 == 0) {
					s++;
				}
			}

			System.out.println(s);

		}
		sc.close();

	}
}
