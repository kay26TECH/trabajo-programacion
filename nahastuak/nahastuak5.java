import java.util.Scanner;
public class nahastuak5
{ public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); double saldoa = 1000, dirua; int aukera;
    do 
    { System.out.println("1. Dirua sartu\n 2. Dirua atera\n 3. Saldoa ikusi\n 4. Irten");
    System.out.print("Aukera: "); 
    aukera = sc.nextInt();
    switch (aukera) { //kasu eszberdin daude eta baokitzan zerbait ezberdin gertatzen da
        case 1: 
            System.out.print("Zenbat sartu? ");
            dirua = sc.nextDouble(); saldoa += dirua; 
            break; //1 kasua da ,dirua sartzeko, galdetzen dugu zenbat sartzen ari da, eta gero, egiten dugu bera saldoa zeukana + oraintxe sartu dun diruarekin.
        case 2: System.out.print("Zenbat atera? ");
            dirua = sc.nextDouble();
            if (dirua <= saldoa) saldoa -= dirua;
            else System.out.println("Ez dago nahikoa saldo.");
            break; //2 kasuan dirua atera izando da, egingo dugu zenbat nahi dun atera - bere saldoa
        case 3: System.out.println("Saldoa: " + saldoa + " euro");
             break;  // 3 kasuan, bakarriko ikusiko duug zenbat saldoa dauka
        case 4: System.out.println("Agur!"); 
             break; default: System.out.println("Aukera okerra."); }
    } while (aukera != 4); 
                     // 4 kasua da bankutik ateratzeko
   sc.close();
} 
}
