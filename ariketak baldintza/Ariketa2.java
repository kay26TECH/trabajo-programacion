import java.util.Scanner;

public class Ariketa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sartu zenbaki oso bat: ");
        int zenbakia = sc.nextInt();

        if (zenbakia == 0) {
            System.out.println("Zenbakia 0 da.");
        } else if (zenbakia % 2 == 0) {
            System.out.println("Zenbakia bikoitia da.");
        } else {
            System.out.println("Zenbakia bakoitia da.");
        }
        
        sc.close();

    }
}