import java.util.Scanner;
public class nahastuak7 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int zenbakia, positiboak = 0, negatiboak = 0, handiena = 0, txikiena = 0; 
    boolean lehenengoa = true;
    do 
        { System.out.print("Sartu zenbaki bat (0 irteteko): "); 
    zenbakia = sc.nextInt(); 
        if (zenbakia != 0) 
        { 
        if (zenbakia > 0) positiboak += zenbakia; 
            else negatiboak += zenbakia; 
        if (lehenengoa) { handiena = zenbakia; txikiena = zenbakia; lehenengoa = false; } 
        if (zenbakia > handiena) handiena = zenbakia; if (zenbakia < txikiena) txikiena = zenbakia; } }     
            while (zenbakia != 0);
    System.out.println("Positiboen batura: " + positiboak); 
    System.out.println("Negatiboen batura: " + negatiboak); 
    if (!lehenengoa) { System.out.println("Handiena: " + handiena); 
        System.out.println("Txikiena: " + txikiena); } 
    
        sc.close();
    }
}
