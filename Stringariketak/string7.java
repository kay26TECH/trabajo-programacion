import java.util.Scanner;

public class string7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Teklatutik irakurtzeko
        System.out.print("Sartu testu bat: ");
        String testua = sc.nextLine();
        String alderantziz = "";
        for (int i = testua.length() - 1; i >= 0; i--) // Testua alderantziz sortu
            alderantziz += testua.charAt(i);
        if (testua.equalsIgnoreCase(alderantziz)) // Maiuskulak ez kontuan hartu
            System.out.println("Palindromoa da.");
        else
            System.out.println("Ez da palindromoa.");
        sc.close();
    }
}
