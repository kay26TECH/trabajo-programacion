import java.util.Scanner;

public class Ariketa7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aukera;
        do {
            System.out.println("\n--- KALKULAGAILUA ---");
            System.out.println("1. Batura");
            System.out.println("2. Kenketa");
            System.out.println("3. Biderketa");
            System.out.println("4. Zatiketa");
            System.out.println("5. Berreketa");
            System.out.println("6. Hondarra");
            System.out.println("0. Irten");
            System.out.print("Aukeratu eragiketa: ");
            
            aukera = sc.nextInt();

            if (aukera >= 1 && aukera <= 6) {
                System.out.print("Sartu lehen zenbakia: ");
                double zenbaki1 = sc.nextDouble();

                System.out.print("Sartu bigarren zenbakia: ");
                double zenbaki2 = sc.nextDouble();

                switch (aukera) {
                    case 1:
                        System.out.println("Emaitza: " + (zenbaki1 + zenbaki2));
                        break;
                    case 2:
                        System.out.println("Emaitza: " + (zenbaki1 - zenbaki2));
                        break;
                    case 3:
                        System.out.println("Emaitza: " + (zenbaki1 * zenbaki2));
                        break;
                    case 4:
                        if (zenbaki2 != 0) {
                            System.out.println("Emaitza: " + (zenbaki1 / zenbaki2));
                        } else {
                            System.out.println("Errorea: ezin da 0z zatitu.");
                        }
                        break;
                    case 5:
                        System.out.println("Emaitza: " + Math.pow(zenbaki1, zenbaki2));
                        break;
                    case 6:
                        if (zenbaki2 != 0) {
                            System.out.println("Emaitza: " + (zenbaki1 % zenbaki2));
                        } else {
                            System.out.println("Errorea: ezin da 0z hondarra kalkulatu.");
                        }
                        break;
                }
            } else if (aukera == 0) {
                System.out.println("Kalkulagailutik irten zara.");
            } else {
                System.out.println("Errorea: aukerak 0 eta 6 artean izan behar du.");
            }

        } while (aukera != 0);
        sc.close();
    }
}