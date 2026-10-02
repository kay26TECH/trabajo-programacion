package pokeariketa;
import java.util.Scanner;

public class PokeJatetxea {

    public static void main(String[] args) {

    
        Scanner sc = new Scanner(System.in);
        String izena;
        String telefonoa;
        int oinarriaAukera;
        String oinarria = "";
        double oinarriaPrezioa = 0;
        String gehigarriak;
        int gehigarriKopurua = 0;
        double gehigarriPrezioa = 0;
        String edariaErantzuna;
        int edariaAukera;
        String edaria = "";
        double edariaPrezioa = 0;

        // Guztizko prezioa
        double guztira;


    

        System.out.println("Ongi etorri Poke Jatetxera!");
        System.out.println();

        System.out.print("Zein da zure izena? ");
        izena = sc.nextLine();

        System.out.print("Zein da zure telefonoa? ");
        telefonoa = sc.nextLine();


        
        
        

        System.out.println();
        System.out.println("========== OINARRIA ==========");
        System.out.println("1. Arroz oinarria       6 €");
        System.out.println("2. Entsalada            4 €");
        System.out.println("3. Quinoa               7 €");
        System.out.println("==============================");

        System.out.print("Aukeratu oinarria: ");
        oinarriaAukera = sc.nextInt();

        // nextInt() ondoren lerro jauzia garbitzeko
        sc.nextLine();

        // Aukeraren arabera oinarria eta prezioa gordetzen dira
        switch (oinarriaAukera) {

            case 1:
                oinarria = "Arroz oinarria";
                oinarriaPrezioa = 6;
                break;

            case 2:
                oinarria = "Entsalada";
                oinarriaPrezioa = 4;
                break;

            case 3:
                oinarria = "Quinoa";
                oinarriaPrezioa = 7;
                break;

            default:
                System.out.println("Aukera ez da zuzena.");
                break;
        }


      

        System.out.println();
        System.out.println("Zein gehigarri nahi dituzu?");
        System.out.println("Idatzi komarekin banatuta:");
        gehigarriak = sc.nextLine();

        // Erabiltzaileak zerbait idatzi badu
        if (!gehigarriak.trim().isEmpty()) {

            // Testua komaren bidez zatitzen da
            String[] gehigarriLista = gehigarriak.split(",");

            // Gehigarri kopurua kalkulatzen da
            gehigarriKopurua = gehigarriLista.length;

            // Gehigarri bakoitzak 0,50 € balio du
            gehigarriPrezioa = gehigarriKopurua * 0.50;
        }


        System.out.println();
        System.out.print("Edaririk nahi duzu? (bai/ez): ");
        edariaErantzuna = sc.nextLine();

        // "bai" erantzuten badu, edarien menua erakusten da
        if (edariaErantzuna.equalsIgnoreCase("bai")) {

            System.out.println();
            System.out.println("========== EDARIA ==========");
            System.out.println("1. Ura               1,5 €");
            System.out.println("2. Freskagarria        3 €");
            System.out.println("3. Irabiatua           5 €");
            System.out.println("============================");

            System.out.print("Aukeratu edaria: ");
            edariaAukera = sc.nextInt();

            // Aukeratutako edaria eta prezioa gordetzen dira
            switch (edariaAukera) {

                case 1:
                    edaria = "Ura";
                    edariaPrezioa = 1.50;
                    break;

                case 2:
                    edaria = "Freskagarria";
                    edariaPrezioa = 3;
                    break;

                case 3:
                    edaria = "Irabiatua";
                    edariaPrezioa = 5;
                    break;

                default:
                    System.out.println("Aukera ez da zuzena.");
                    break;
            }
        }



        guztira = oinarriaPrezioa + gehigarriPrezioa + edariaPrezioa;


        System.out.println();
        System.out.println("====================================");
        System.out.println("             ZURE POKEA");
        System.out.println("====================================");
        System.out.println();

        System.out.println("Bezeroa: " + izena);
        System.out.println("Telefonoa: " + telefonoa);
        System.out.println();

        System.out.printf("Oinarria: %-20s %.2f €%n",
                oinarria, oinarriaPrezioa);

        // Gehigarririk badago, informazioa erakusten da
        if (gehigarriKopurua > 0) {

            System.out.printf(
                    "Gehigarriak: %d x 0,50 €      %.2f €%n",
                    gehigarriKopurua,
                    gehigarriPrezioa
            );

        } else {

            System.out.println("Gehigarriak: Ez");
        }

        // Edaria eskatu badu, erakusten da
        if (edariaPrezioa > 0) {

            System.out.printf(
                    "%-29s %.2f €%n",
                    edaria + ":",
                    edariaPrezioa
            );
        }

        System.out.println();
        System.out.println("------------------------------------");

        System.out.printf(
                "GUZTIRA:                     %.2f €%n",
                guztira
        );

        System.out.println("====================================");

        System.out.println("Eskerrik asko, " + izena + "!");


        // Scanner-a itxi
        sc.close();
    }
}