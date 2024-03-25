
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            } else if (input > greatest) {
                greatest = input;
            }

            list.add(input);
        }
        
        System.out.print("The greatest number: " + greatest);

        // implement finding the greatest number in the list here
    }
}
