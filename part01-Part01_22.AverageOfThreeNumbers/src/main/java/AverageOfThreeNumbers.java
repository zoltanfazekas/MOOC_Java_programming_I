
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int ertek = 0;
        System.out.println("Give the first number:");
        int szam1 = scanner.nextInt();
        ertek++;
        
        System.out.println("Give the second number:");
        int szam2 = scanner.nextInt();
        ertek++;
        
        System.out.println("Give the third number:");
        int szam3 = scanner.nextInt();
        ertek++;
        double ans = (1.0 * szam1 + szam2 + szam3) / ertek;
        
        System.out.println("The average is " + ans);
        
 
        
        
    }
}
