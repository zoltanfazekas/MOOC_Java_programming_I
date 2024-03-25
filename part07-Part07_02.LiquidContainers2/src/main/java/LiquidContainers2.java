
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        
        UserInterface ui = new UserInterface(firstContainer, secondContainer, scanner);
        ui.start();
        
        
        
//        Scanner scan = new Scanner(System.in);
//
//        Container container = new Container();
//        System.out.println(container);
//
//        container.add(50);
//        System.out.println(container);
//        System.out.println(container.contains());
//
//        container.remove(60);
//        System.out.println(container);
//
//        container.add(200);
//        System.out.println(container);

        
        
        
//        while (true) {
//            System.out.print("> ");
//
//            String input = scan.nextLine();
//            if (input.equals("quit")) {
//                break;
//            }
//
//        }
    }

}
