package aceptaElReto;

import java.util.Scanner;

public class P191 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int comp = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < comp; i++) {
			String lineas = sc.nextLine();
			String[] numeros = lineas.split(" ");
			int c = Integer.parseInt(numeros[0]);
			int l = Integer.parseInt(numeros[1]);
			int d = Integer.parseInt(numeros[2]);
			int diferencia = l + d;
			int total = 0;

			if (c > 0 && l > 0 && d >= 0) {
				for (int j = 0; j < c; j++) {

					diferencia -= d;
					total += diferencia;
				}

			}
			System.out.println(total);

		}
		sc.close();
	}
}
