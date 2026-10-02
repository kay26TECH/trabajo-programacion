import java.util.Scanner;
public class ariketa1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("sartu zure izena");
        String izena= sc.nextLine();
        System.out.println("Sartu zure adina");
        int adina = sc.nextInt();
        sc.close();
        System.out.println("kaixo" + izena + "," + adina + "urte dituzu");

    }
}