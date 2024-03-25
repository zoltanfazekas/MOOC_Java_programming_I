import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<String> cim = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        int j = 0;
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            cim.add(title);
            
            System.out.println("Pages: ");
            String page = scanner.nextLine();
            
            
            
            
            System.out.println("Publication year: ");
            String year = scanner.nextLine();
            
//            String[] parts = title.split(",");
//            title = parts[0];
//            page = (parts[1]);
            books.add(new Book(title, Integer.valueOf(page), Integer.valueOf(year)));
        }
        
        
        
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        
        if (info.equals("everything")) {
            System.out.println(books.toString());
            System.out.println("");
        } else if (info.equals("name")) {
            for (String cimek: cim) {
                System.out.println(cimek);
            }
        }

    }
}
