
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = 10000;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int szam = scanner.nextInt();
            if (szam == 9999) {
                break;
            } else if (szam < smallest) {
                smallest = szam;
            }
            list.add(szam);
        }
        
 
        System.out.println("Smallest number: " + smallest);
        //System.out.print("Found at index: " + );
        for (int i = 0; i < list.size(); i++) {
            if (smallest == list.get(i)) {
                System.out.println("Found az index: " + i);
            }
        }
        
    }
}
