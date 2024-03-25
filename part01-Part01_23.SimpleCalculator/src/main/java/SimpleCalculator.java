
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int n1 = scanner.nextInt();
        
        System.out.println("Give the second number:");
        int n2 = scanner.nextInt();
        
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        System.out.println(n1 + " / " + n2 + " = " + ((double) n1 / n2));
    }
}
