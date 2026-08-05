/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Molaei
 */
public class UserInterface {

    private TodoList list;
    private Scanner scr;

    public UserInterface(TodoList list, Scanner scr) {
        this.list = list;
        this.scr = scr;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String strCmd = scr.nextLine();
            if (strCmd.equals("stop")) {
                break;
            } else if (strCmd.equals("add")) {
                this.add();
            } else if (strCmd.equals("list")) {
                this.list.print();
            } else if (strCmd.equals("remove")) {
                this.remove();
            }
        }
    }

    private void add() {
        System.out.println("To add:");
        String strTask = scr.nextLine();
        this.list.add(strTask);
    }

    private void remove() {
        System.out.println("Which one is removed?");
        int num = Integer.valueOf(scr.nextLine());
        this.list.remove(num);
    }
}
