
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int szam = 0;
        int ossz = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            
            if (num == 0) {
                break;
            } else {
                szam++;
                ossz = ossz + num;
            }
        }
        System.out.println("Number of numbers: " + szam);
        System.out.println("Sum of the numbers: " + ossz);
    }
}
