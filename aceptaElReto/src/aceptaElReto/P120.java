package aceptaElReto;

import java.util.Scanner;

public class P120 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int lado = 0;
		do {
			lado = in.nextInt();
			if (lado != 0) {
				int inicial = in.nextInt();

				int constanteM�gica = ((lado * lado + inicial - 1 + inicial) / 2) * lado;
				System.out.println(constanteM�gica);
			}
		} while (lado != 0);
	}
}
