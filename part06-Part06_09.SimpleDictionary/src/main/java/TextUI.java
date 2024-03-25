
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zoli
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (word.equals("add")) {
                System.out.print("Word: ");
                String orig = scanner.nextLine();
                System.out.println("Translation: ");
                String ford = scanner.nextLine();
                this.dictionary.add(orig, ford);
                continue;
            } else if (word.equals("search")) {
                System.out.println("To be translated: ");
                String translated = scanner.nextLine();
                if(dictionary.translate(translated) == null) {
                    System.out.println("Word " + translated + " was not found");
                    
                } else {
                    System.out.println("Translation: " + this.dictionary.translate(translated));
                    
                }
                
            } else {
                System.out.println("Unknown command");
            }
            
            
        }

    }

}
