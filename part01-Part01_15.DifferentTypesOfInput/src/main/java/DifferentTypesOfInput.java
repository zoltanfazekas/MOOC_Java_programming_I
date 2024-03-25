
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give a string:");
        String valami = scan.nextLine();
        
        System.out.println("Give an integer:");
        int szam = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double dubi = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean buli = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + valami);
        System.out.println("You gave the integer " + szam);
        System.out.println("You gave the double " + dubi);
        System.out.println("You gave the boolean " + buli);

    }
}
