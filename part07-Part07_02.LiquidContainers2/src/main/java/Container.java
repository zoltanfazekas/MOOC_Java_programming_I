/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zoli
 */
public class Container {

    private int szam;

    public Container() {
        this.szam = 0;
    }

    public int contains() {
        return this.szam;
        
    }

    public void add(int amount) {
        if (amount < 0) {
            this.szam = szam;
        } else if ((this.szam + amount) > 100) {
            this.szam = 100;
        } else {
            this.szam = this.szam + amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            this.szam = szam;
        } else if ((this.szam - amount) < 0) {
            this.szam = 0;
        } else {
            this.szam = this.szam - amount;

        }
    }

    public String toString() {
        return this.szam + "/100";
    }

}
