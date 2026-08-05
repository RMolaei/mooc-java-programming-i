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
public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maximumWeight) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            return this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item itemItem : this.items) {
            totalWeight += itemItem.getWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Item itemItem : this.items) {
            System.out.println(itemItem);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        int index = 0;
        Item heaviestItem = this.items.get(index);
        index++;
        while(index < this.items.size()) {
            Item itemVar = this.items.get(index);
            if (heaviestItem.getWeight() < itemVar.getWeight()) {
                heaviestItem = itemVar;
            }
            index++;
        }
        return heaviestItem;
    }
}
