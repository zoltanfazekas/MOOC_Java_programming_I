
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println("Longest: " + j.longest());
//
//        j.add("magneto");
//        j.add("mystique");
//        j.add("phoenix");

        SimpleCollection c = new SimpleCollection("test");
        c.add("long");
        c.add("longer");
        c.add("short");

        System.out.println("Longest: " + c.longest());

    }
}
