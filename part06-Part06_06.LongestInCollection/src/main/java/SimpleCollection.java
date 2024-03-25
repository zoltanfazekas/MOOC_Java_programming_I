
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest() {
        if(this.elements.isEmpty()) {
            //System.out.println(this.elements);
            return null;
        }
        
        String returnObject = "";
        
        for (int i = 0; i < this.elements.size(); i++) {
            if (returnObject.length() < this.elements.get(i).length()) {
                returnObject = this.elements.get(i);
            }
        }
        
        return returnObject;
    }

}
