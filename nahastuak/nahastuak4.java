import java.util.Scanner;
public class nahastuak4 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sekretua = (int)(Math.random() * 10) + 1, zenbakia = 0;
    while (zenbakia != sekretua) { // mientras zenbakia diferentea da sekretua ordun...
        System.out.print("Asmatu zenbakia (1-10): ");
        zenbakia = sc.nextInt(); 
        if (zenbakia < 1 || zenbakia > 10) // si zenbakia 1 baino txikiagoa da eta 10 baino handiagoa  bada ordun...
    System.out.println("Errorea: 1 eta 10 artean sartu.");
    else if (zenbakia != sekretua) // zenbakia ezberdin  sekretua baino  ordun ...
        System.out.println("Ez da. Saiatu berriro."); }
        System.out.println("Asmatu duzu!");
    sc.close();
} }   
    