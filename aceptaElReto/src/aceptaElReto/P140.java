package aceptaElReto;

import java.util.Scanner;

public class P140 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numeros;
		String numero, cadena;
		numero = sc.nextLine();

		while (!numero.contains("-")) {
			cadena = "";
			int suma = 0;

			numeros = new int[numero.length()];

			for (int i = 0; i < numero.length(); i++) {
				numeros[i] = Integer.parseInt(String.valueOf(numero.charAt(i)));
			}

			for (int i = 0; i < numeros.length; i++) {

				cadena += numeros[i];
				if (numero.length() - 1 > i) {
					cadena += " + ";

				} else {
					cadena += " = ";
				}

				suma += numeros[i];

			}

			System.out.println(cadena + suma);
			numero = sc.nextLine();
		}
		sc.close();
	}
}
