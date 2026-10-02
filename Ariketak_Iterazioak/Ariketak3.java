import java.util.Scanner;

public class Ariketak3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Sartu lehen zenbakia: ");
        int lehenZenbakia = sc.nextInt();

        System.out.print("Sartu bigarren zenbakia: ");
        int bigarrenZenbakia = sc.nextInt();

        while (lehenZenbakia >= bigarrenZenbakia) {
            System.out.println("Lehen zenbakia bigarrena baino txikiagoa izan behar da.");

            System.out.println("Sartu bigarren zenbakia: ");
            bigarrenZenbakia = sc.nextInt();
        }

        int i = lehenZenbakia;

        while (i <= bigarrenZenbakia) {

            if (i % 3 == 0) {
                System.out.println(i);
            }

            i++;
        }

        sc.close();
    }
}