package aceptaElReto;

import java.util.Scanner;

public class P405 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int actual, siguiente, anterior;

		boolean guion;

		while (true) {

			actual = sc.nextInt();

			if (actual == 0) {
				break;
			}

			guion = false;

			anterior = actual;

			while (true) {

				siguiente = sc.nextInt();

				if (anterior == siguiente - 1) {

					guion = true;

				}

				else {

					if (guion) {

						System.out.print(actual + "-" + anterior);

						actual = siguiente;

						guion = false;

						if (siguiente != 0) {
							System.out.print(",");
						}

					}

					else {

						System.out.print(anterior);

						actual = siguiente;

						if (siguiente != 0) {
							System.out.print(",");
						}

					}

				}

				anterior = siguiente;

				if (siguiente == 0) {
					break;
				}

			}

			System.out.println("");

		}
		sc.close();
	}
}
