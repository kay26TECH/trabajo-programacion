import java.util.Scanner;

public class Ariketa8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letrak = "TRWAGMYFPDXBNJZSQVHLCKE";

        System.out.print("Sartu NAN zenbakia, letrarik gabe: ");
        int nan = sc.nextInt();

        if (nan >= 10000000 && nan <= 99999999) {
            char letra = letrak.charAt(nan % 23);
            System.out.println("NAN osoa: " + nan + letra);
        } else {
            System.out.println("Errorea: NANak 8 zifra izan behar ditu.");
     
       }
       sc.close();
    }
}
