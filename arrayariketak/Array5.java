package arrayariketak;

import java.util.Scanner;

public class Array5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] hiriak = {
            "Bilbo",
            "Donostia",
            "Gasteiz",
            "Irun",
            "Andoain",
            "Azpeitia",
            "Tolosa",
            "Arrasate",
            "Alicante",
            "Madril"
        };

        // Lehen hiria hartzen dugu hasieran luzeena bezala
        String luzeena = hiriak[0];

        int bostBainoGehiago = 0;

        // Hiri guztiak aztertu
        for (int i = 0; i < hiriak.length; i++) {

            // Izen luzeena bilatu
            if (hiriak[i].length() > luzeena.length()) {
                luzeena = hiriak[i];
            }

            // A letraz hasten direnak
            if (hiriak[i].startsWith("A")) {
                System.out.println("A letraz hasten da: " + hiriak[i]);
            }

            // 5 karaktere baino gehiago
            if (hiriak[i].length() > 5) {
                bostBainoGehiago++;
            }
        }

        System.out.println("Izenik luzeena duen hiria: " + luzeena);

        System.out.println(
            "5 karaktere baino gehiago dituzten hiriak: "
            + bostBainoGehiago
        );

        // Erabiltzaileari hiri bat eskatu
        System.out.print("Sartu bilatu nahi duzun hiria: ");
        String bilatu = sc.nextLine();

        boolean aurkituta = false;

        // Hiria bilatu
        for (int i = 0; i < hiriak.length; i++) {

            if (hiriak[i].equalsIgnoreCase(bilatu)) {
                aurkituta = true;
            }
        }

        if (aurkituta) {
            System.out.println("Hiria arrayan dago.");
        } else {
            System.out.println("Hiria ez dago arrayan.");
        }

        sc.close();
    }
}