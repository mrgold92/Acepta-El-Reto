package aceptaElReto;

import java.util.Scanner;

public class P337 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vueltas = sc.nextInt();

		for (int j = 0; j < vueltas; j++) {

			int[] arriba = new int[6];
			int[] abajo = new int[6];

			for (int i = 0; i < arriba.length; i++) {
				arriba[i] = sc.nextInt();
			}

			for (int i = 0; i < abajo.length; i++) {
				abajo[i] = sc.nextInt();
			}

			boolean ok = true;

			int suma = arriba[0] + abajo[0];

			for (int i = 1; i < 6; i++) {
				if (arriba[i] + abajo[i] != suma) {
					ok = false;
					break;
				}
			}

			String res = ok ? "SI" : "NO";

			System.out.println(res);
		}
		sc.close();
	}
}
