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
public class Birds {

    private ArrayList<Bird> birds;

    public Birds() {
        this.birds = new ArrayList<>();
    }

    public void add(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }

    public void observation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.observation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void print(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void print() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
