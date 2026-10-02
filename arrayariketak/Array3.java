package arrayariketak;
public class Array3 {

    public static void main(String[] args) {

        int[] zenbakiak = new int[20];

        int batura = 0;
        long biderkadura = 1;

        // Arraya ausaz bete
        for (int i = 0; i < zenbakiak.length; i++) {

            zenbakiak[i] = (int)(Math.random() * 100) + 1;

            System.out.println("Posizioa " + i + ": " + zenbakiak[i]);

            // Posizio bikoitia
            if (i % 2 == 0) {
                batura = batura + zenbakiak[i];
            }

            // Posizio bakoitia
            else {
                biderkadura = biderkadura * zenbakiak[i];
            }
        }

        System.out.println("Posizio bikoitien batura: " + batura);
        System.out.println("Posizio bakoitien biderkadura: " + biderkadura);
    }
}