import java.util.Scanner;

public class Ariketa5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sartu nota (0-10): ");
        int nota = sc.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota ez da baliozkoa.");
        } else if (nota < 5) {
            System.out.println("GUTXI");
        } else if (nota < 6) {
            System.out.println("NAHIKO");
        } else if (nota < 7) {
            System.out.println("ONGI");
        } else if (nota < 9) {
            System.out.println("OSO ONGI");
        } else {
            System.out.println("BIKAIN");
        }
        sc.close();
    }
}