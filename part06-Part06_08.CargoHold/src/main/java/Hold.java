
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
public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suit;
    private int totalWeight = 0;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suit = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.maximumWeight >= totalWeight + suitcase.totalWeight()) {
            totalWeight = totalWeight + suitcase.totalWeight();
            this.suit.add(suitcase);
        }
    }

    public void printItems() {

        for (int i = 0; i < suit.size(); i++) {
            suit.get(i).printItems();
        }

    }

    public String toString() {

        return String.valueOf(this.suit.size()) + " suitcases (" + totalWeight + " kg)";
    }

}
