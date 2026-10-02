import java.util.Scanner;

public class string8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Teklatutik irakurtzeko
        System.out.print("Sartu esaldi bat: ");
        String esaldia = sc.nextLine().trim(); // Kanpoko zuriuneak kendu
        if (esaldia.isEmpty())
            System.out.println("0 hitz.");
        else
            System.out.println(esaldia.split("\\s+").length + " hitz."); // Zuriunez banatu
        sc.close();
    }
}
