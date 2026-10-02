import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sartu testu bat: ");
        String testua = sc.nextLine();
        System.out.println("Luzera: " + testua.length());
        if (testua.length() >= 7)
            System.out.println("7. karakterea: " + testua.charAt(6));
        else
            System.out.println("Testuak ez ditu 7 karaktere.");
        int posizioa = testua.indexOf('x');
        if (posizioa == -1)
            System.out.println("Karakterea ez da aurkitu");
        else
            System.out.println("Lehen x karakterea: " + posizioa);
        System.out.println("Maiuskulaz: " + testua.toUpperCase());
        sc.close();
    }
}
