import java.util.Scanner;

public class string6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Teklatutik irakurtzeko
        System.out.print("Sartu esaldi bat: ");
        String esaldia = sc.nextLine();
        System.out.println(esaldia.replace( ' ', '_')); // Zuriuneak _ bihurtu
        sc.close();
    }
}
