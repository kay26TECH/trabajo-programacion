import java.util.Scanner;

public class string4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Teklatutik irakurtzeko
        System.out.print("Sartu lehen testua: ");
        String lehenengoa = sc.nextLine(); // Lehen testua
        System.out.print("Sartu bigarren testua: ");
        String bigarrena = sc.nextLine(); // Bigarren testua
        System.out.println(lehenengoa + bigarrena); // Bi testuak elkartzeko
        sc.close();
    }

}
