
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int num1 = scan.nextInt();
        
        System.out.println("Give the second number:");
        int num2 = scan.nextInt();
        
        if (num1 == num2) {
            System.out.println("The numbers are equal!");
        } else if (num1 > num2) {
            System.out.println("Greater number is: " + num1);
        } else {
            System.out.println("Greater number is: " + num2);
        }
    }
}
