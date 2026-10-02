import java.util.Scanner;

public class Ariketak6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int zenbakia;

        do {
            System.out.print("Sartu zenbaki oso bat: ");
            zenbakia = sc.nextInt();

            if (zenbakia < 0) {
                System.out.println("Errorea: Zenbakia 0 edo handiagoa izan behar da.");
            }

        } while (zenbakia < 0);

        long faktoriala = 1;
        int i = 1;

        if (zenbakia > 0) {
            do {
                faktoriala = faktoriala * i;
                i++;
            } while (i <= zenbakia);
        }

        System.out.println(zenbakia + " zenbakiaren faktoriala " + faktoriala + " da.");

        sc.close();
    }
}