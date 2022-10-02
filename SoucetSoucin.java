import java.util.Scanner;

public class SoucetSoucin {
    
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
        
        System.out.println("Zadejte dvě čísla ");
        
        int n1, n2, soucet, soucin;
        n1 = readme.nextInt();
        n2 = readme.nextInt();
        
        soucet = n1 + n2;
        soucin = n1*n2;
        System.out.println("Součet " + soucet);
        System.out.println("Součin " + soucin);
        
    }
}
