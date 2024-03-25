
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int posSzam = 0;
        int posOssz = 0;
        
        while (true) {
            int num = scanner.nextInt();
            
            if (num == 0) {
                break;
            } else if (num < 0) {
                continue;
            } else {
                posSzam++;
                posOssz = posOssz + num;
                continue;
            }
        }
       
        if (posOssz == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double aver = (double) posOssz / posSzam;
            System.out.println(aver);
        }
    }
}
