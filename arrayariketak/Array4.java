package arrayariketak;
public class Array4 {

    public static void main(String[] args) {

        int[] zenbakiak = new int[20];

        // 1etik 9rako zenbakien kopurua gordetzeko
        int[] maiztasunak = new int[9];

        // Array nagusia bete
        for (int i = 0; i < zenbakiak.length; i++) { 

            zenbakiak[i] = (int)(Math.random() * 9) + 1;

            System.out.print(zenbakiak[i] + " ");

            // Adibidez zenbakia 5 bada, 4. posizioan gehitzen du
            maiztasunak[zenbakiak[i] - 1]++;
        }

        System.out.println();

        // Maiztasunak erakutsi
        for (int i = 0; i < maiztasunak.length; i++) {

            System.out.println(
                (i + 1) + " zenbakia " + maiztasunak[i] + " aldiz agertzen da"
            );
        }
    }
}