import java.util.Scanner;

public class ariketa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Sartu prezioa:\n");
        double prezioa = sc.nextDouble();
        
        double bukaerakoPrezioa = prezioa * 1.21;
        
        System.out.println("Bukaerako prezioa: " + bukaerakoPrezioa + " da.");
        
        sc.close();
    }
}