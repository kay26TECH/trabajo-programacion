package probak;
import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zenbakia;

        do {
            System.out.print("Sartu zenbaki positibo bat: ");
            zenbakia = sc.nextInt();

            if (zenbakia < 0) {
                System.out.println("Zenbaki negatiboa!");
            }
        } while (zenbakia <= 0);

        System.out.println("Ongi!");

        sc.close();
    }
}