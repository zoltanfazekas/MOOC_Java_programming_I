

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        
//        int szam = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (searching == array[i]) {
//                System.out.println(array[i] + " is at index " + i);
//                szam = searching;
//                
//            } 
                int index = 0;
                int hossz = array.length - 1;
                boolean megvan = false;
                while (index < array.length) {
                    if (array[index] == searching) {
                        System.out.println(searching + " is at index " + index + ".");
                        megvan = true;
                    } 
                        index++;


        }
                if (megvan == false) {
                    System.out.println(searching + " was not found.");
                   
                }
                
                
}
}

    


