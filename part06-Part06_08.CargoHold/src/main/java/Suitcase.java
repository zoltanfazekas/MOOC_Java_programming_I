
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
public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int ossz = 0;
        for (int i = 0; i < this.items.size(); i++) {
            ossz = ossz + this.items.get(i).getWeight();
        }

        if (this.maximumWeight >= ossz + item.getWeight()) {
            ossz = ossz + item.getWeight();
            items.add(item);
        }
    }

    public String toString() {
        int osszkg = 0;
        
        for (int i = 0; i < this.items.size(); i++) {
            osszkg = osszkg + this.items.get(i).getWeight();
        }
        if (osszkg == 0) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return String.valueOf(this.items.size()) + " item (" + osszkg + " kg)";
        } else {
            return String.valueOf(this.items.size()) + " items (" + osszkg + " kg)";
        }
    }
    
    public void printItems() {
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println(this.items.get(i));
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for (Item item: items) {
            total = total + item.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem() {
        if (items.size() == 0) {
            return null;
        }
        Item heavy = items.get(0);
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getWeight() > heavy.getWeight()) {
                heavy = items.get(i);
            }
        }
        return heavy;
    }
}
