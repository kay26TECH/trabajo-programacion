import java.util.Scanner;

public class string5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Teklatutik irakurtzeko
        System.out.print("Sartu lehen testua: ");
        String lehenengoa = sc.nextLine();
        System.out.print("Sartu bigarren testua: ");
        String bigarrena = sc.nextLine();
        if (lehenengoa.equals(bigarrena)) // equals erabiliz konparatu bi textuak
            System.out.println("Berdinak dira.");
        else
            System.out.println("Ez dira berdinak.");
        sc.close();
    }
}
