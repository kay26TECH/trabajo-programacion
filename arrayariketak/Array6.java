package arrayariketak;  
import java.util.Scanner; 

public class Array6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ikasle kopurua eskatu
        System.out.print("Zenbat ikasle daude? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] izenak = new String[n];
        double[] notak = new double[n];

        double batura = 0;

        // Ikasleen datuak eskatu
        for (int i = 0; i < n; i++) {

            System.out.print("Sartu " + (i + 1) + ". ikaslearen izen osoa: ");
            izenak[i] = sc.nextLine();

            System.out.print("Sartu nota: ");
            notak[i] = sc.nextDouble();

            // Nota balidatu
            while (notak[i] < 0 || notak[i] > 10) {

                System.out.print("Errorea. Sartu nota 0 eta 10 artean: ");
                notak[i] = sc.nextDouble();
            }

            sc.nextLine();

            batura = batura + notak[i];
        }

        // Ikasle eta nota guztiak erakutsi
        System.out.println("\nIKASLEEN NOTAK");

        for (int i = 0; i < n; i++) {

            System.out.println(
                izenak[i] + " - " + notak[i]
            );
        }

        // Batezbestekoa
        double batezbestekoa = batura / n;

        System.out.println("\nKlaseko batezbestekoa: " + batezbestekoa);

        // Batezbestekoa baino nota handiagoa dutenak
        System.out.println("\nBatezbestekoa baino nota handiagoa:");

        for (int i = 0; i < n; i++) {

            if (notak[i] > batezbestekoa) {
                System.out.println(izenak[i] + " - " + notak[i]);
            }
        }

        // Nota altuena eta baxuena
        double altuena = notak[0];
        double baxuena = notak[0];

        for (int i = 1; i < n; i++) {

            if (notak[i] > altuena) {
                altuena = notak[i];
            }

            if (notak[i] < baxuena) {
                baxuena = notak[i];
            }
        }

        // Nota altuena
        System.out.println("\nNota altuena: " + altuena);

        System.out.println("Nota altuena duten ikasleak:");

        for (int i = 0; i < n; i++) {

            if (notak[i] == altuena) {
                System.out.println(izenak[i]);
            }
        }

        // Nota baxuena
        System.out.println("\nNota baxuena: " + baxuena);

        System.out.println("Nota baxuena duten ikasleak:");

        for (int i = 0; i < n; i++) {

            if (notak[i] == baxuena) {
                System.out.println(izenak[i]);
            }
        }

        sc.close();
    }
}