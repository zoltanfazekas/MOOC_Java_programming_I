
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ossz = 0;
        System.out.print("First number? ");
        int first = scanner.nextInt();
        
        System.out.print("Last number? ");
        int last = scanner.nextInt();
        
        for (int i = first; i <= last; i++) {
            ossz = ossz + i;
        }
        System.out.print("The sum is: " + ossz);
    }
}
