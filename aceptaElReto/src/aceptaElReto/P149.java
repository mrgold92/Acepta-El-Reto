package aceptaElReto;

import java.util.Scanner;

public class P149 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int     num     = 0;
        int     mayor;

        while (entrada.hasNext()) {
            mayor = 0;
            int numb = entrada.nextInt();
            for (int i = 0; i < numb; i++) {
                num = entrada.nextInt();

                if (num > mayor) {
                    mayor = num;
                }
            }
            System.out.println(mayor);
        }
        entrada.close();
    }
}
