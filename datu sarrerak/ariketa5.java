import java.util.Scanner;

public class ariketa5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Sartu lehen nota:\n");
        int nota1 = sc.nextInt();
        
        System.out.print("Sartu bigarren nota:\n");
        int nota2 = sc.nextInt();
        
        System.out.print("Sartu hirugarren nota:\n");
        int nota3 = sc.nextInt();
        
        double batezbestekoa = (nota1 * 0.3) + (nota2 * 0.2) + (nota3 * 0.5);
        
        System.out.println("Sartutako hiru noten batezbestekoa " + batezbestekoa + " da.");
        
        sc.close();
    }
}