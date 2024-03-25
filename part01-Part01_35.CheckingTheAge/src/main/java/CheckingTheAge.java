
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How old are you?");
        
        int num = scan.nextInt();
        
        if (num >= 0 && num <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
