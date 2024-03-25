
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ossz = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            ossz = ossz + num;
            list.add(num);
        }
        double avg = (double) ossz / (list.size());
        System.out.println("Average: " + avg);
        
    }
}
