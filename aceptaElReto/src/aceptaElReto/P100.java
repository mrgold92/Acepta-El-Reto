package aceptaElReto;

/**
 * C�digo inspirado en el usuario MiYazJE.
 * @see <a href="https://github.com/MiYazJE/Acepta-el-reto/blob/master/p100.java">MiYazJE</a>
 */
import java.util.Scanner;

public class P100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int contador = 0;
		int coicide, asc, desc;

		int vueltas = sc.nextInt();

		for (int i = 0; i < vueltas; i++) {

			contador = 1;

			num = sc.nextInt();

			if (num == 6174) {
				contador = 0;
			} else if (num == 0) {
				contador = 8;
			} else {
				while (num < 1000) {
					num *= 10;
				}

				desc = desc(num);

				asc = asc(num);

				coicide = desc - asc;

				if (coicide == 0) {

					contador = 8;
				} else {
					while (coicide != 6174 && contador < 8) {

						contador++;
						desc = desc(coicide);

						while (desc < 1000) {
							desc *= 10;
						}

						asc = asc(coicide);

						coicide = desc - asc;
					}
				}
			}
			System.out.println(contador);
		}
		sc.close();

	}

	public static int asc(int num) {
		int d, a, ord;
		d = a = ord = 0;

		for (int i = 0; i <= 9; i++) {

			a = num;

			while (a > 0) {

				d = a % 10;

				if (d == i) {
					ord = (ord * 10) + d;
				}

				a /= 10;

			}

		}

		return ord;
	}

	public static int desc(int num) {
		int d, a, ord;
		d = a = ord = 0;

		for (int i = 9; i >= 0; i--) {

			a = num;

			while (a > 0) {

				d = a % 10;

				if (d == i) {
					ord = (ord * 10) + d;
				}

				a /= 10;

			}

		}

		return ord;
	}
}
