public class ArrayBatura {

    public static void main(String[] args) {

        // 10 zenbakiko array-a sortu
        int[] zenbakiak = {-10, 8, 0, 9, 10*10, 2, 5/2, 3*3, 5, 7};

        // Batura gordetzeko aldagaia
        int batura = 0;

        // Array-ko zenbaki guztiak batu
        for (int i = 0; i < zenbakiak.length; i++) {
            batura = batura + zenbakiak[i];
        }

        // Emaitza erakutsi
        System.out.println("Elementu guztien batura: " + batura);
    }
}