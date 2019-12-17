package aceptaElReto;

import java.util.Scanner;

public class P364 {
	public static void main(String[] args) {
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		Scanner sc = new Scanner(System.in);
		String encriptada = "";
		String frase = sc.nextLine().toUpperCase();

		while (!frase.equals("FIN")) {

			for (int i = 0; i < frase.length(); i++) {

				int posicionAbecedario = abc.indexOf(frase.charAt(i));

				if (posicionAbecedario == -1) {
					encriptada += " ";
				} else if (posicionAbecedario == abc.length() - 1) {
					encriptada += abc.charAt(0);
				} else {
					encriptada += abc.charAt(posicionAbecedario + 1);
				}

			}

			System.out.println(encriptada);
			frase = sc.nextLine().toUpperCase();
			encriptada = "";
		}
		sc.close();

	}

}
