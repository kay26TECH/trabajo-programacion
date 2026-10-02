import java.util.Scanner;

public class Ariketak2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // zenbaki bat batetik hamar arte biak barne idatzi
        System.out.print("Sartu 1 eta 10 arteko zenbaki bat (biak barne): ");
        int zenbakia = sc.nextInt();
        //zenbakia aldagaia gorde
        // zenbakia 1 baino txikiagoa ez bada eta 10 baino handiagoa ez bada.... 
        while (zenbakia < 1 || zenbakia > 10) {
            System.out.println("Errorea: Sarrerako zenbakia 1 eta 10 artean egon behar da.");
            // jarri errorea aurreko codigoa cumplitzen badu.
            System.out.println("Sartu 1 eta 10 arteko zenbaki bat (biak barne): ");
            zenbakia = sc.nextInt();
            // eta berriro jarri idazteko zenbaki bat batetik hamartara biak barne
        }

        int i = 1;
        // I balioa 1 zehaztu
        // I 10 baino txikiagoa edo berdina bada ...
        while (i <= 10) {
            System.out.println(zenbakia + " x " + i + " = " + (zenbakia * i));
            i++;
        }
        
        sc.close();
    }
}