
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        int ossz = 0;
        int paros = 0;
        int paratlan = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        Statistics sum = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                //System.out.println("Sum: " + sum.sum());
                break;
            } else {
                sum.addNumber(num);
                
                if (num % 2 == 0) {
                    even.addNumber(num);
                } else {
                    odd.addNumber(num);
                }
                
            }
        }
        System.out.println("Sum: " + sum.sum());
        
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
        
//        Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
    
        
    }
    
        
}
