public class nahastuak8
 { public static void main(String[] args) {
    int bizitza = 100; while (bizitza > 0) // bizitza balioa ematen diogu, 100 da eta esaten dugu mientras bizitza 0 baino handiagoa denean kaltea, zenbaki random bat izango da eta bizitza - kaltea egingo du alien golpe bat simulatzen
         { int kaltea = (int)(Math.random() * 16) + 5; bizitza -= kaltea; 
    if (bizitza < 0) bizitza = 0; 
    System.out.println  ("Alienak " + kaltea + " kalte egin du. Bizitza: " + bizitza); 
    // bizitza 0 baino txikiagoa bada ordun, print Alienak "kaltea kantitatea" kalte egiten du  bizitza "bizitza kantitatea da"
        } System.out.println("Jokalaria hil da.");
} }


