
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ossz = 1;
        System.out.println("Give a number: ");
        int num = scanner.nextInt();
        
        for (int i = 1; i <= num; i++) {
            ossz = ossz * i;
        }
        System.out.println("Factorial: " + ossz);
    }
}
