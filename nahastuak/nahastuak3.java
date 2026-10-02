import java.util.Scanner;
public class nahastuak3 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Zenbat aldiz bota dadoa? ");
    int aldiz = sc.nextInt();
    for (int i = 1; i <= aldiz; i++)
        System.out.println(i + ". jaurtiketa: " + ((int)(Math.random() * 6) + 1));
    sc.close();
} }