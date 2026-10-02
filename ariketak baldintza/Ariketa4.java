import java.util.Scanner;

public class Ariketa4 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Erosketaren prezioa: ");
        double prezioa = sc.nextDouble();
        System.out.print("Emandako dirua: ");
        double dirua = sc.nextDouble();

        if (dirua >= prezioa) {
            System.out.println("Itzuli beharrekoa: " + (dirua - prezioa) + " euro");
        } else {
            System.out.println("Ez dago nahikoa diru erosketa ordaintzeko.");
        }
        sc.close();
    }
}