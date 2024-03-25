
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private ArrayList<Bird> birdList;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.birdList = new ArrayList<>();
        this.scanner = scanner;

    }

    public void observation() {
        System.out.print("Bird?: ");
        String birdName = scanner.nextLine();

        for (Bird b : birdList) {
            if (b.getName().equals(birdName)) {

                b.addObservation();
            }
        }

        for (Bird c : birdList) {
            if (!c.getName().equals(birdName)) {
                System.out.println("Not a bird!");
            }
        }

    }

    public void add() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();
        Bird newBird = new Bird(name, latinName);
        birdList.add(newBird);
    }

    public void one() {
        System.out.print("Bird? ");
        String birdSearch = scanner.nextLine();
        for (Bird search : this.birdList) {
            if (search.getName().equals(birdSearch)) {
                System.out.println(search);
            }
        }
    }

    public void all() {
        for (Bird all : this.birdList) {
            System.out.println(all);
        }
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String input = scanner.nextLine();
            if (input.equals("Add")) {
                add();
            }
            if (input.equals("Observation")) {
                observation();
            }
            if (input.equals("All")) {
                all();
            }
            if (input.equals("One")) {
                one();
            }
            if (input.equals("Quit")) {
                break;
            }
        }
    }

}
