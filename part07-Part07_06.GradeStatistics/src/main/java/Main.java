
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ossz = 0;
        int participant = 0;
        int passing = 0;
        int succeeded = 0;
        ArrayList<Integer> tablazat = new ArrayList<>();
       
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int number = scanner.nextInt();
            if (number <= 100 && number >= 90) {
                tablazat.add(5);
            } else if (number < 90 && number >= 80) {
                tablazat.add(4);
            } else if (number < 80 && number >= 70) {
                tablazat.add(3);
            } else if (number < 70 && number >= 60) {
                tablazat.add(2);
            } else if (number < 60 && number >= 50) {
                tablazat.add(1);
            } else if (number < 50 && number >= 0) {
                tablazat.add(0);
            }
            
            if (number == -1) {
                break;
            } else if ((number >= 0) && (number <= 100)) {
                ossz = ossz + number;
                participant++;
                if ((number >= 50) && (number <= 100)) {
                    passing = passing + number;
                    succeeded++;
                }
            }
}

        System.out.println("Point average (all): " + (ossz / (double) participant));
        
        if (succeeded == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing):  " + ((double) passing / succeeded));
        }
        
        System.out.println("Pass percentage: " + 100 * succeeded / (double) participant);
        
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            
            for (int j = 0; j < tablazat.size(); j++) {
                if (tablazat.get(j) == i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        
    }
}
