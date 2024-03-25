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
public class UserInterface {
    private TodoList todolist;
    private Scanner scanner;
    
    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String adding = scanner.nextLine();
                todolist.add(adding);
            } else if (command.equals("list")) {
                todolist.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int szam = scanner.nextInt();
                todolist.remove(szam);
            }
        }
    }
    
}
