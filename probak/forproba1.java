import java.util.Scanner;

public class forproba1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sartu zenbaki bat: ");
        int zenbakia = sc.nextInt();

        for (int i = 0; i < zenbakia; i++) {
            System.out.print("*");
        }

        System.out.println();
        sc.close();
    }
}
