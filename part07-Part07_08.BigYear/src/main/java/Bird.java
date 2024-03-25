
import java.util.ArrayList;
import java.util.Scanner;

public class Bird {
    
    private int observations;
    private String birdNames;
    private String latinNames;

    public Bird(String name, String latinName){
        this.birdNames = name;
        this.observations = 0;
        this.latinNames = latinName;

    }
    public String getName(){
        return birdNames;
    }
    public void setName(String newName){
        newName = this.birdNames;
    }
    public void setLatinNames(String newLatin){
        newLatin = this.latinNames;
    }

    public int getObservations(){
        return observations;
    }
    public int addObservation(){
        return this.observations++;
    }
    public String toString(){
        return birdNames+"("+latinNames+")"+":"+ this.observations +" observations";
    }
    
    
    
    
    
}
