package aceptaElReto;

import java.util.Scanner;

public class P300 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < casos; i++) {
			boolean pentavocalica = false;
			String palabra = sc.nextLine();

			if (palabra.contains("a") && palabra.contains("e") && palabra.contains("i")
					&& palabra.contains("o") && palabra.contains("u")) {
				pentavocalica = true;
			}

			System.out.println(pentavocalica ? "SI" : "NO");

		}
		sc.close();

	}

}
