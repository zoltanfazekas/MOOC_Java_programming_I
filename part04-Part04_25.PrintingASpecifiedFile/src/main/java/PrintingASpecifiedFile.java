
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String name = scanner.nextLine();
        findFile(name);
        
        
        

    }
    
    public static void findFile(String name) {
        try (Scanner scanner = new Scanner(Paths.get(name))) {
            
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        }
        
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

