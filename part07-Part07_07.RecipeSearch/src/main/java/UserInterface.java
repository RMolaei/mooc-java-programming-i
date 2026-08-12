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
    }

    public void start() {
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        this.commands = new Commands(this.scanner, fileName);

        System.out.println("");
        this.commands.printCommands();

        boolean running = true;
        while (running) {
            System.out.println("");
            System.out.println("Enter command:");
            String cmd = scanner.nextLine();
            running = this.commands.executeCommand(cmd);
        }
    }
}
