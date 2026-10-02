package arrayariketak;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] notak = new int[10];

        int handiena = 0;
        int gaindituak = 0;

        // 10 notak eskatu
        for (int i = 0; i < notak.length; i++) {

            System.out.print("Sartu " + (i + 1) + ". nota: ");
            notak[i] = sc.nextInt();

            // Nota 1 eta 10 artean egon behar da
            while (notak[i] < 1 || notak[i] > 10) {
                System.out.print("Errorea. Sartu nota bat 1 eta 10 artean: ");
                notak[i] = sc.nextInt();
            }
        }

        // Arraya errekorritu
        for (int i = 0; i < notak.length; i++) {

            // Nota handiena bilatu
            if (notak[i] > handiena) {
                handiena = notak[i];
            }

            // 5 edo gehiago dutenak gaindituta
            if (notak[i] >= 5) {
                gaindituak++;
            }
        }

        System.out.println("Nota handiena: " + handiena);
        System.out.println("Gainditu duten ikasleak: " + gaindituak);

        sc.close();
    }
}