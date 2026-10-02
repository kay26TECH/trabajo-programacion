import java.util.Scanner;

public class string10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Teklatutik irakurtzeko
        System.out.print("Sartu esaldi bat: ");
        String esaldia = sc.nextLine().trim();
        String siglak = ""; // Siglak gordetzeko
        if (!esaldia.isEmpty()) {
            String[] hitzak = esaldia.split("\\s+"); // Esaldia hitzetan banatu
            for (int i = 0; i < hitzak.length; i++) // Hitz bakoitzaren lehen letra hartu
                siglak += Character.toUpperCase(hitzak[i].charAt(0));
        }
        System.out.println("Siglak: " + siglak);
        sc.close();
    }
}
