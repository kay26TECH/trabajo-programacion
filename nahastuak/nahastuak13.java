import java.util.Scanner;
public class nahastuak13
 { public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Idatzi zenbaki bat: ");
     int n = sc.nextInt(), zenbakia = 1; 
     for (int i = 1; i <= n; i++) 
        { for (int j = 1; j <= i; j++) 
    System.out.print(zenbakia++ + "\t"); 
    System.out.println(); } 
    sc.close();
} }
