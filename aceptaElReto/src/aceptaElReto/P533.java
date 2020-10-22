package aceptaElReto;

import java.util.Scanner;

public class P533 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nc = sc.nextInt();

		for (int i = 0; i < nc; i++) {

			int po = sc.nextInt();
			int poKg = po * 1000;
			int w = 0;
			int sum = 0;
			int participante = 0;

			int c = 1;

			do {
				w = sc.nextInt();
				sum += w;

				double bo = ((sum * 0.125) / 1) * 1000;

				if (bo >= poKg) {
					participante = c;
					
				}else {
					c++;
				}
				

			} while (w != 0);

			if (participante >=1) {
				System.out.println(participante);
			} else {
				System.out.println("SIGAMOS RECICLANDO");
			}

		}

		sc.close();
	}
}
