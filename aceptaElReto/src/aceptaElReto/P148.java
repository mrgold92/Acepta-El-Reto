package aceptaElReto;

import java.util.Scanner;

public class P148 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h;
		int min;
		String all;
		do {
			all = sc.nextLine();

			if (!all.equals("00:00")) {
				String[] horasMinutos = all.split(":");

				h = Integer.parseInt(horasMinutos[0]);
				min = Integer.parseInt(horasMinutos[1]);

				int minutoshoras = (86400 - ((h * 60 * 60) + (min * 60))) / 60;

				System.out.println(minutoshoras);
			}
		} while (!all.equals("00:00"));
		sc.close();
	}
}
