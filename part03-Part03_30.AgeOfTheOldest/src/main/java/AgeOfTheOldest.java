
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (true) {
            String word = scanner.nextLine();
            
            if (word.equals("")) {
                break;
            } else {
                String[] parts = word.split(",");
                for (int i = 0; i < parts.length-1; i++) {
                    if (Integer.valueOf(parts[1]) > max) {
                        max = Integer.valueOf(parts[1]);
                    }
                }
            }
            
        }
        System.out.println(max);
        


    }
}
