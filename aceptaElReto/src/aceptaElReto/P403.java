package aceptaElReto;

import java.util.Scanner;

public class P403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vueltas = sc.nextInt();

		for (int i = 0; i < vueltas; i++) {

			double largo = sc.nextDouble();
			double ancho = sc.nextDouble();

			if (45 * 90 <= largo / ancho && 120 * 90 >= largo / ancho) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}

		}
		sc.close();
	}
}
