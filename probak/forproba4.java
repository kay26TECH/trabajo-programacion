package probak;
import java.util.Scanner;

public class forproba4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int handiena = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Sartu " + i + ". zenbakia: ");
            int zenbakia = sc.nextInt();

            if (i == 1 || zenbakia > handiena) {
                handiena = zenbakia;
            }
        }

        System.out.println("Handiena: " + handiena);
        sc.close();
    }
}
