package probak;
public class forproba5 {
    public static void main(String[] args) {
        int fila = 5;

        for (int i = 1; i <= fila; i++) {
            for (int hutsa = 1; hutsa <= fila - i; hutsa++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
