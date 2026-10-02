import java.util.Scanner;

public class ariketa6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Sartu kateto baten luzera:\n");
        double kateto1 = sc.nextDouble();
        
        System.out.print("Sartu beste katetoaren luzera:\n");
        double kateto2 = sc.nextDouble();
        
        double hipotenusa = Math.sqrt((kateto1 * kateto1) + (kateto2 * kateto2));
        
        System.out.println("Hipotenusak " + hipotenusa + "-(e)ko luzera du.");
        
        sc.close();
    }
}