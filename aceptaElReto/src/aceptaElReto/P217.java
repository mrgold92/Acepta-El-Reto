package aceptaElReto;

import java.util.Scanner;

public class P217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			num = sc.nextInt();
			if (num != 0) {
				if (num % 2 == 0) {
					System.out.println("DERECHA");
				} else {
					System.out.println("IZQUIERDA");
				}
			}
		} while (num != 0);
		sc.close();
	}
}
