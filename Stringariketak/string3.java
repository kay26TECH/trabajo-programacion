import java.util.Scanner;

public class string3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Teklatutik irakurtzeko
        System.out.print("Sartu testu bat: ");
        String testua = sc.nextLine();
        String alderantziz = ""; // Testu berria
        for (int i = testua.length() - 1; i >= 0; i--) // Amaieratik hasierara
            alderantziz += testua.charAt(i);
        System.out.println(alderantziz);
        sc.close();
    }
}
