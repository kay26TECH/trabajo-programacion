import java.util.Scanner;

public class Ariketa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sartu lehen zenbakia: ");
        int zenbaki1 = sc.nextInt();

        System.out.print("Sartu bigarren zenbakia: ");
        int zenbaki2 = sc.nextInt();

        if (zenbaki1 > zenbaki2) {
            System.out.println("Handiena: " + zenbaki1);
        } else if (zenbaki2 > zenbaki1) {
            System.out.println("Handiena: " + zenbaki2);
        } else {
            System.out.println("Zenbakiak berdinak dira.");
        }

        sc.close();
    }
}