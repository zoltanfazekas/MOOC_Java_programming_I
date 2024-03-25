
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ossz = 0;
        int leng = 0;
        double avg = 0;
        int szam = 0;
        String longest = "";
        while (true) {
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            } else {
                String[] nevek = name.split(",");
                for (int i = 0; i < nevek.length; i++) ;
                ossz = ossz + Integer.valueOf(nevek[1]);
                szam++;
                if (nevek[0].length() > leng) {
                    leng = nevek[0].length();
                    longest = nevek[0];

                }

                avg = ossz / (double) szam;

            }

        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + avg);
    }
}
