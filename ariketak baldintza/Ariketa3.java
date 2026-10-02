import java.util.Scanner;

public class Ariketa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sartu 4 zifrako zenbakia: ");
        int zenbakia = sc.nextInt();

        if (zenbakia >= 1000 && zenbakia <= 9999) {
            int milakoak = zenbakia / 1000;
            int ehunekoak = (zenbakia / 100) % 10;
            int hamarrekoak = (zenbakia / 10) % 10;
            int unitateak = zenbakia % 10;
            int batura = milakoak + ehunekoak + hamarrekoak + unitateak;
            System.out.println("Zifren batura: " + batura);
        } else {
            System.out.println("Errorea: zenbakiak 4 zifra izan behar ditu.");
        }
         sc.close();

    }
}