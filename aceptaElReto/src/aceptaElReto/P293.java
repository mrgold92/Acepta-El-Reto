package aceptaElReto;

import java.util.Scanner;

public class P293 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();
		int[] patas = new int[5];
		for (int i = 0; i < casos; i++) {

			for (int j = 0; j < patas.length; j++) {
				patas[j] = sc.nextInt();
			}

			int suma = 0;

			suma = patas[0] * 6 + patas[1] * 8 + patas[2] * 10 + patas[3] * (2 * patas[4]);

			System.out.println(suma);
		}
		sc.close();
	}
}
