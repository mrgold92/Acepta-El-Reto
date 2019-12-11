package aceptaElReto;

import java.util.Scanner;

public class P105 {

	public static void main(String[] args) {
		String[] days = { "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" };

		Scanner sc = new Scanner(System.in);
		double d = 0;
		while ((d = sc.nextDouble()) != -1) {
			double mayor;
			double menor;
			double s;
			mayor = menor = s = d;
			int indiceMayor;
			int indiceMenor;
			indiceMayor = indiceMenor = 0;
			boolean esMayor;
			boolean esMenor;
			esMayor = esMenor = false;

			for (int i = 1; i <= 5; i++) {
				d = sc.nextDouble();
				s += d;
				if (d == mayor) {
					esMayor = true;
				} else if (d > mayor) {
					mayor = d;
					indiceMayor = i;
					esMayor = false;
				} else if (d == menor) {
					esMenor = true;
				} else if (d < menor) {
					menor = d;
					indiceMenor = i;
					esMenor = false;
				}
			}

			if (esMayor || esMenor) {
				System.out.print("EMPATE\n");

			} else {
				System.out.print(days[indiceMayor] + " " + days[indiceMenor] + " " + (s / 6 < d ? "SI" : "NO") + "\n");
			}

		}

	}
}