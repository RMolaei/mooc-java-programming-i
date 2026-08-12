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
public class Commands {

    private Scanner scanner;
    private Birds birds;
    private Command[] commands;

    public Commands(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new Birds();
        commands = new Command[]{
            new Command(
            "Add",
            new Command.CommandAction() {
                @Override
                public boolean execute(Scanner scanner, Birds birds) {
                    System.out.println("Name:");
                    String name = scanner.nextLine();
                    System.out.println("Name in Latin:");
                    String latinName = scanner.nextLine();
                    birds.add(name, latinName);
                    return true;
                }
            }),
            new Command(
            "Observation",
            new Command.CommandAction() {
                @Override
                public boolean execute(Scanner scanner, Birds birds) {
                    System.out.println("Bird?");
                    String name = scanner.nextLine();
                    birds.observation(name);
                    return true;
                }
            }),
            new Command(
            "All",
            new Command.CommandAction() {
                @Override
                public boolean execute(Scanner scanner, Birds birds) {
                    birds.print();
                    return true;
                }
            }),
            new Command(
            "One",
            new Command.CommandAction() {
                @Override
                public boolean execute(Scanner scanner, Birds birds) {
                    System.out.println("Bird?");
                    String name = scanner.nextLine();
                    birds.print(name);
                    return true;
                }
            }),
            new Command(
            "Quit",
            new Command.CommandAction() {
                @Override
                public boolean execute(Scanner scanner, Birds birds) {
                    return false;
                }
            })
        };
    }

    public boolean executeCommand(String cmd) {
        for (Command command : this.commands) {
            if (command.getName().equals(cmd)) {
                return command.run(this.scanner, this.birds);
            }
        }
        return true;
    }
}
