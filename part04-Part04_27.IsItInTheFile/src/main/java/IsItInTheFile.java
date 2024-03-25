
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Name of the file:");
//        String file = scanner.nextLine();
//
//        System.out.println("Search for:");
//        String searchedFor = scanner.nextLine();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        //System.out.println("");
        
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String row = fileScan.nextLine();
                list.add(row);
                System.out.println("Search for:");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed.");
            
        }

        //System.out.println("Search for:");
        
            String name = scanner.nextLine();
            

            if (list.contains(name)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        

        
    }

    
}
