import java.util.Scanner;

public class ariketa2
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Sartu zenbaki oso bat:\n");
        int zenbakia = sc.nextInt();
        
        int bikoitza = zenbakia * 2;
        int hirukoitza = zenbakia * 3;
        
        System.out.println(zenbakia + " zenbakiaren bikoitza " + bikoitza + " da eta hirukoitza " + hirukoitza);
        
        sc.close();
    }
}