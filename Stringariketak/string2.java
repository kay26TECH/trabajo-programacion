import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sartu testu bat: ");
        String testua = sc.nextLine();
        int kopurua = 0;
        for (int i = 0; i < testua.length(); i++)
            if (testua.charAt(i) == 'a')
                kopurua++;
        System.out.println("a letra " + kopurua + " aldiz agertzen da.");
        sc.close();
    }
}
