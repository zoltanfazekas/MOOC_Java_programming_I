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
public class Room {
    private ArrayList<Person> persons;
    
    
    public Room() {
        this.persons = new ArrayList<>();
        
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        
        Person returnObject = persons.get(0);
        
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getHeight() < returnObject.getHeight()) {
                
                returnObject = persons.get(i);
            }
        }
        
        return returnObject;
    }
    
    public Person take() {
        int szam = 0;
        if (persons.isEmpty()) {
            return null;
        }       
        Person rem = persons.get(0);      
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getHeight() < rem.getHeight()) {
                szam = i;
                rem = persons.get(i);
            }
        }
        Person removed = persons.remove(szam);
        return removed;
    }
  
    
}
