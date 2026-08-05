/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Molaei
 */
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack = new ArrayList<>();

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        return (ArrayList) this.stack.clone();
    }

    public String take() {
        int size = this.stack.size();
        if (size == 0) {
            return "";
        }
        String strVar = this.stack.get(size - 1);
        this.stack.remove(size - 1);
        return strVar;
    }

}
