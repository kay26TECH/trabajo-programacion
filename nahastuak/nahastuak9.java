import java.util.Scanner;
public class nahastuak9 
{ public static void main(String[] args) {
    Scanner sc = new Scanner
(System.in); int batura = 0, zenbakia, kopurua = 0;// aldagaiak definitzen ditugu
while (kopurua < 10 && batura < 100) //bitartean kopurua 10  baino txikiagoa eta batura 100 baino txikiagoa denean zenbaki bat eskatuko dugu
    { System.out.print("Sartu zenbaki bat: ")
    ;zenbakia = sc.nextInt(); batura += zenbakia; kopurua++; } // Zenbaki aldagaia gorde eta gero jarriko dugu, batura + zenbakia/ kopurua +1
    System.out.println("Batura: " + batura);  // orain print egingo dugu batura + "baturaren balioa"
if (kopurua == 10) 
    System.out.println("10 zenbaki sartu dira."); // kopurua 10 berdin ba da print egingo dugu, 10 zenbaki sartu dira, edo..
    else System.out.println("Batura 100era iritsi da."); // batura 100 era iritsi da
        sc.close();
    } 
}
