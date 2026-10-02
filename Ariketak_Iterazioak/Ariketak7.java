import java.util.Scanner;

public class Ariketak7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int kopurua;

        do {
            System.out.print("Sartu Fibonacci segidaren zenbaki kopurua: ");
            kopurua = sc.nextInt();

            if (kopurua <= 0) {
                System.out.println("Errorea: Zenbaki positibo bat sartu behar duzu.");
            }

        } while (kopurua <= 0);

        int zenbakia1 = 1;
        int zenbakia2 = 1;
        int hurrengoa;
        int i = 0;

        System.out.println("Hau da Fibonacci segida:");

        do {
            System.out.println(zenbakia1);

            hurrengoa = zenbakia1 + zenbakia2;
            zenbakia1 = zenbakia2;
            zenbakia2 = hurrengoa;

            i++;

        } while (i < kopurua);

        sc.close();
    }
}