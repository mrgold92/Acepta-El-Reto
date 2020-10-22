package aceptaElReto;

import java.util.Scanner;

public class P532 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nc = sc.nextInt();

        for(int i = 0; i<nc; i++){
            int pn = sc.nextInt();
            int pt = sc.nextInt();
            System.out.println(pt-pn);
        }

        sc.close();
    }
}
