package aceptaElReto;

import java.util.Scanner;

public class P480 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int casos = s.nextInt();
		int uvas, a, b, calculo;

		for (int i = 0; i < casos; i++) {

			uvas = s.nextInt();
			a = s.nextInt();
			b = s.nextInt();

			int res = uvas / b;
			int sol = res * a;

			if (res * b != uvas) {
				calculo = (uvas - res * b);
				if (calculo >= a) {
					sol += a;
				} else {
					sol += calculo;
				}
			}

			System.out.println(sol);

		}
		s.close();

	}

}
