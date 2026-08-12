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

    private Scanner scanner;
    private Commands commands;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.commands = new Commands(this.scanner);
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("?");
            String cmd = scanner.nextLine();
            running = this.commands.executeCommand(cmd);
        }
    }
}
