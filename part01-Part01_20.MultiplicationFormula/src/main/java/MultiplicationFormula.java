
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give the first number:");
        int szam1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int szam2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println(szam1 + " * " + szam2 + " = " + (szam1 * szam2));

    }
}
