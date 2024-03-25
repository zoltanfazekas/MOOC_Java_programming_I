
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        int win = 0;
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        try(Scanner valami = new Scanner(Paths.get(file))) {
            while (valami.hasNextLine()) {
                String line = valami.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                String name2 = parts[1];
                int point = Integer.valueOf(parts[2]);
                int point2 = Integer.valueOf(parts[3]);
                if (team.equals(parts[0]) && point > point2 || team.equals(parts[1]) && point2 > point) {
                    list.add(name);
                    win++;
                }
                
                if (team.equals(parts[0]) || team.equals(parts[1])) {
                    count++;
                }
                
                
               
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + count);
        
        
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + (count - win));
    }

}
