public class Ariketak1 {

    public static void main(String[] args) {
        //i balioa 1 da adierazten dugu
        int i = 1;
        // erakutsi erabileari "txikitik handira"
        System.out.println("Txikitik handira:");
        // i txikiagoa bada 10 baino ordun erakutsi (i) eta gero +1
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        // i balioa aldatzen dugu, zeren orain handienetik txikira jarri behar dugu.
        i = 10;

        System.out.println("Handitik txikira:");
        // i handiagoa edo berdina bada 1 baino ordun erakutsi (i) eta gero -1
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}