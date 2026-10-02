package arrayariketak;

public class Array2 {

    public static void main(String[] args) {

        int[] adinak = new int[20];

        int batura = 0;

        // Adinak ausaz sortu
        for (int i = 0; i < adinak.length; i++) {

            adinak[i] = (int) (Math.random() * 18) + 18;

            System.out.println((i + 1) + ". ikaslea: " + adinak[i] + " urte");

            batura = batura + adinak[i];
        }

        // Batezbestekoa kalkulatu
        double batezbestekoa = (double) batura / adinak.length;

        System.out.println("Adinen batezbestekoa: " + batezbestekoa);
    }
}