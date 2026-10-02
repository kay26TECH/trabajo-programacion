import java.util.Scanner;
public class nahastuak1 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int batura = 0, zenbakia;
    do { System.out.print("Sartu zenbaki bat (0 irteteko): "); 

    zenbakia = sc.nextInt(); batura += zenbakia; }

    while (zenbakia != 0);
    
    System.out.println("Batura: " + batura); sc.close();
} }
