
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
            
            String word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            } else {
            lista.add(word);    
            }
            
            
        }
        System.out.println(lista.size());

    }
}
