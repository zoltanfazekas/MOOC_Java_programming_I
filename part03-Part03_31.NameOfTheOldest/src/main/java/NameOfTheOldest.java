
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int max = 0;
        String name = "";
        while (true) {
            String word = scanner.nextLine();
            
            if (word.equals("")) {
                break;
            } else {
                String[] parts = word.split(",");
                for (int i = 0; i < parts.length-1; i++) {
                    if (Integer.valueOf(parts[1]) > max) {
                        max = Integer.valueOf(parts[1]);
                        name = parts[0];
                    }
                }
            }
            
        }
        
        System.out.println("Name of the oldest: " + name);


    }
}
