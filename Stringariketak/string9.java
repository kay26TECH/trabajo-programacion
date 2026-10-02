import java.util.Scanner;

public class string9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Teklatutik irakurtzeko
        System.out.print("Sartu lehen hitza: ");
        String lehenengoa = sc.nextLine();
        System.out.print("Sartu bigarren hitza: ");
        String bigarrena = sc.nextLine();
        int konparaketa = lehenengoa.compareToIgnoreCase(bigarrena); // Alfabetikoki konparatu
        if (konparaketa == 0)
            System.out.println("Berdinak dira.");
        else if (konparaketa < 0)
            System.out.println(lehenengoa + " lehenago dator alfabetikoki.");
        else
            System.out.println(bigarrena + " lehenago dator alfabetikoki.");
        sc.close();
    }
}
