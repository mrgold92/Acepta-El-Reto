package aceptaElReto;

import java.util.Scanner;

public class P208 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long numFilas, filaDada;

		while (true) {

			numFilas = sc.nextLong();
			filaDada = sc.nextLong();

			if (numFilas == 0 && filaDada == 0) {
				break;
			}

			long totalBolos = (numFilas * (numFilas + 1)) / 2;
			long filasAfectadas = Math.abs((numFilas - filaDada) + 1);

			long a = (filasAfectadas * (filasAfectadas + 1)) / 2;

			System.out.println(totalBolos - a);

		}

		sc.close();

	}
}
