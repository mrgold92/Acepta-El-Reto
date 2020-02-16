package aceptaElReto;


import java.util.Scanner;

public class P178 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int casos = tc.nextInt();

        tc.nextLine();
        for (int i = 0; i < casos; i++) {
            String palabra = tc.nextLine().toLowerCase().replace(" ", "");
            String mensaje = tc.nextLine().toLowerCase().replace(" ", "");

            if (palabra.length() > 2000) {
                break;
            }
            int contador = 0;
            boolean igual = false;
            for (int j = 0; j < palabra.length(); j++) {

                if (palabra.charAt(j) == mensaje.charAt(contador)) {
                    contador++;
                    if (contador == mensaje.length()) {
                        igual = true;
                        break;

                    }
                }
            }
            if (igual) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }


    }
}

