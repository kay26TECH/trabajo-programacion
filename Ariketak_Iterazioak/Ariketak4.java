import java.util.Scanner;

public class Ariketak4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;
        int positiboak = 0;

        while (i < 10) {

            System.out.print("Sartu zenbaki osoa: ");
            int zenbakia = sc.nextInt();

            if (zenbakia > 0) {
                positiboak++;
            }

            i++;
        }

        System.out.println("Zenbaki positiboen kopurua: " + positiboak);

        sc.close();
    }
}