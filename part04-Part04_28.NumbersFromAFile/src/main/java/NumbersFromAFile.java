
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        
        try(Scanner fileContents = new Scanner(Paths.get(file))) {
            while (fileContents.hasNextLine()) {
                list.add(Integer.valueOf(fileContents.nextLine()));
            }
            
            for(int value: list) {
                if(value <= upperBound && value >= lowerBound) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Numbers: " + count);

    }
    
    
    
    

}
