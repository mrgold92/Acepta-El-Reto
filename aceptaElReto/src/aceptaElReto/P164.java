package aceptaElReto;

import java.util.Scanner;

public class P164 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int     x1, y1, x2, y2;

        while (true) {

            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            if (x2 < x1 || y2 < y1) break;

            System.out.println((x2 - x1) * (y2 - y1));
        }

        sc.close();
    }
}
