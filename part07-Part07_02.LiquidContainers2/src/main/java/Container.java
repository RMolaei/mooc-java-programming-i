/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Molaei
 */
public class Container {

    private final int storageCapacity;
    private int currentAmount;

    public Container(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public Container() {
        this(100);
    }

    public int capacity() {
        return this.storageCapacity;
    }

    public int contains() {
        return this.currentAmount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        if (this.currentAmount + amount > this.storageCapacity) {
            this.currentAmount = this.storageCapacity;
        } else {
            this.currentAmount += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        if (this.currentAmount - amount < 0) {
            this.currentAmount = 0;
        } else {
            this.currentAmount -= amount;
        }
    }

    @Override
    public String toString() {
        return this.currentAmount + "/" + this.storageCapacity;
    }

}
