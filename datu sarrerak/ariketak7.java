import java.util.Scanner;

public class ariketak7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Sartu segundu kopuru bat:\n");
        int totalSegundu = sc.nextInt();
        
        int orduak = totalSegundu / 3600;
        int hondarra = totalSegundu % 3600;
        int minutuak = hondarra / 60;
        int segunduak = hondarra % 60;
        
        System.out.println(totalSegundu + " segundu, " + orduak + " ordu, " + minutuak + " minutu eta " + segunduak + " segundu dira.");
        
        sc.close();
    }
} 
