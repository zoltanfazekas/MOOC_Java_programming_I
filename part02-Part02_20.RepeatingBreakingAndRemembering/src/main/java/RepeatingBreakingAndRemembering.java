
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int ossz = 0;
        int number = 0;
        int paros = 0;
        int paratlan = 0;
        System.out.println("Give numbers:");
        while (true) {
            num = scanner.nextInt();
            if (num == -1) {
                break;
            } else if (num % 2 == 0) {
                paros++;
                ossz = ossz + num;
                number++;
            } else {
                paratlan++;
                ossz = ossz + num;
                number++;
            }
            
            
        }
        
        
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + ossz);
        System.out.println("Numbers: " + number);
        System.out.println("Average " + ((double) ossz / number));
        System.out.println("Even: " + paros);
        System.out.println("Odd: " + paratlan);
            
        

    }
}
