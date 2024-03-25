
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        int ertek = 0;
        System.out.println("Give the first number:");
        int szam1 = Integer.valueOf(scanner.nextLine());
        ertek++;
        
        System.out.println("Give the second number:");
        int szam2 = Integer.valueOf(scanner.nextLine());
        ertek++;
        
        System.out.println("The average is " + (float) (szam1 + szam2) / ertek);

    }
}
