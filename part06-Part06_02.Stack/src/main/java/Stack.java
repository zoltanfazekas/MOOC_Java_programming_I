
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zoli
 */
public class Stack {
    private ArrayList<String> verem;
    
    public Stack() {
        this.verem = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if(this.verem.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value) {
        this.verem.add(value);
    }
    
    public ArrayList<String> values() {
        return this.verem;
    }
    
    public String take() {
        return this.verem.remove(verem.size() - 1);
        
        
    }
}
