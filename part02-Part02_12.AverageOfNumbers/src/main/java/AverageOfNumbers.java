
import java.util.Scanner;

public class AverageOfNumbers {

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
        double average = (double) ossz / szam;
        System.out.println("Average of the numbers: " + average);
    }
}
