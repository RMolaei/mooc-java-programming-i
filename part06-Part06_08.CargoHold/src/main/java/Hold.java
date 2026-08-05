/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author Molaei
 */
public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcaseItem : this.suitcases) {
            totalWeight += suitcaseItem.totalWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Suitcase suitcaseItem : this.suitcases) {
            suitcaseItem.printItems();
        }
    }

}
