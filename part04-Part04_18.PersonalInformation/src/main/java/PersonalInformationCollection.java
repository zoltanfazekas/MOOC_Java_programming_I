
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("First name: ");
            String firstname = scanner.nextLine();
            if (firstname.isEmpty()) {
                break;
            } 
            
            System.out.print("Last name: ");
            String lastname = scanner.nextLine();
            
            System.out.print("Identification number: ");
            String id = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstname, lastname, id));

        }
        
        
        for (PersonalInformation personal: infoCollection) {
            System.out.println();
            System.out.println(personal.getFirstName() + " " + personal.getLastName());
        }
    }
}
