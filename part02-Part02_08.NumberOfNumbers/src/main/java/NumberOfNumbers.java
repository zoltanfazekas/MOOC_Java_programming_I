
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ossz = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                ossz++;
            }
        }
        System.out.println("Number of numbers: " + ossz);
    }
}
