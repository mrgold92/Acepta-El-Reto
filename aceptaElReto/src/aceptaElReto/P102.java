package aceptaElReto;

import java.util.Scanner;

public class P102 {

	public static void main(String[] args) {
		String abc = "abcdefghijklmnopqrstuvwxyz";
		Scanner sc = new Scanner(System.in);

		int c = abc.indexOf("p");

		while (true) {
			String palabra = sc.nextLine();
			int resta = c - abc.indexOf(palabra.charAt(0));

			if (resta < 0) {
				resta = abc.length() - ((-1) * resta);
			}

			int vocales = 0;
			String mensajeEncriptado = "";

			for (int i = 0; i < palabra.length(); i++) {
				int ch = abc.indexOf(Character.toLowerCase(palabra.charAt(i)));

				char cq;
				if (ch < 0) {
					cq = palabra.charAt(i);
				} else {
					int cN = (ch + resta) % abc.length();
					cq = abc.charAt(cN);

				}

				if (Character.isUpperCase(palabra.charAt(i))) {
					mensajeEncriptado += Character.toUpperCase(cq);

				} else {
					mensajeEncriptado += cq;
				}

				if ((cq == 'a') || (cq == 'e') || (cq == 'i') || (cq == 'o') || (cq == 'u') || (cq == 'A')
						|| (cq == 'E') || (cq == 'I') || (cq == 'O') || (cq == 'U')) {
					vocales++;
				}

			}
			if (mensajeEncriptado.equals("pFIN") == false) {
				System.out.println(vocales);
			} else {
				break;
			}
		}
		sc.close();
	}

}
