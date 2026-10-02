import java.util.Scanner;
public class nahastuak10
{ public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
     System.out.print("Idatzi zenbaki bat: "); //zenaki bat eskatzen dugu
 int n = sc.nextInt(); //gordetzen dugu n aldagaia
 for (int i = 1; i <= n; i++) // bukle bat i berdin 1 ba i n txikiagoa edo berdin ba da i+1

    { for (int j = 1; j <= i; j++)  // beste bukle bat j = 1 eta j txikiagoa bada edo berdin i baino ordun j+1
    System.out.print("*"); 
    System.out.println(); } 
sc.close();
 } 
}


