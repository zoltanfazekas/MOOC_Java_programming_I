
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
    
    public String toString() {
        
        String output = "";
        
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } 
        
        if (elements.size() == 1) {
            output = "The collection " + this.name + " has " + this.elements.size() + " element:" + "\n";
        } else {
            output = "The collection " + this.name + " has " + this.elements.size() + " elements:" + "\n";     
    }
        
        String tulos = "";
        
        
        for (int i = 0; i < elements.size(); i++) {
            
            if(i == elements.size()-1) {
                tulos = tulos + elements.get(i);
            } else {
                tulos = tulos + elements.get(i) + "\n";
            }
        }
        
       return output + tulos;
    }
}
