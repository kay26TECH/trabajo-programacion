import java.util.Scanner;

public class Ariketak5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bikoitiak = 0;
        int bakoitiak = 0;

        System.out.print("Sartu zenbaki osoak, bukatu 0 zenbakia sartuz: ");
        int zenbakia = sc.nextInt();

        while (zenbakia != 0) {

            if (zenbakia % 2 == 0) {
                bikoitiak++;
            } else {
                bakoitiak++;
            }

            System.out.print("Sartu zenbaki osoak, bukatu 0 zenbakia sartuz: ");
            zenbakia = sc.nextInt();
        }

        System.out.println("Zenbaki bakoitien kopurua: " + bakoitiak);
        System.out.println("Zenbaki bikoitien kopurua: " + bikoitiak);

        sc.close();
    }
}