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
public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        for (int index = 0; index < this.list.size(); index++) {
            int indexPlus = index + 1;
            System.out.println(indexPlus + ": " + this.list.get(index));
        }
    }

    public void remove(int number) {
        if (0 < number && number <= this.list.size()) {
            number = number - 1;
            this.list.remove(number);
        }
    }
}
