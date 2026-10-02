import java.util.Scanner;

public class ariketa4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Sartu lehen zenbaki osoa:\n");
        int zenbaki1 = sc.nextInt();
        
        System.out.print("Sartu bigarren zenbaki osoa:\n");
        int zenbaki2 = sc.nextInt();
        
        System.out.print("Sartu hirugarren zenbaki osoa:\n");
        int zenbaki3 = sc.nextInt();
        
        double batezbestekoa = (double) (zenbaki1 + zenbaki2 + zenbaki3) / 3;
        
        System.out.println("Sartutako hiru zenbakien batezbestekoa " + batezbestekoa + " da.");
        
        sc.close();
    }
}