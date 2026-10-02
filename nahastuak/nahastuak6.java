public class nahastuak6 { public static void main(String[] args) {
    int a = (int)(Math.random() * 9) + 1, 
    b = (int) (Math.random() * 9) + 1,
    c = (int)(Math.random() * 9) + 1;
    System.out.println(a + " | " + b + " | " + c); 
if (a == b && b == c)
    System.out.println("JACKPOT!");
} }
