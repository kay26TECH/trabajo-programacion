import java.util.Scanner;
public class nahastuak2 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int batura = 0, handiena = 0, puntuak;
     do { System.out.print("Sartu puntuazioa (0 irteteko): "); 
          puntuak = sc.nextInt();
    if (puntuak > handiena) handiena = puntuak; batura += puntuak; }
     while (puntuak != 0);
        System.out.println("Handiena: " + handiena);
        System.out.println("Batura: " + batura);
     sc.close();
} }
