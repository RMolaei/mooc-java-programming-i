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
    private Recipes recipes;
    private Command[] commands;

    public Commands(Scanner scanner, String fileName) {
        this.scanner = scanner;
        this.recipes = new Recipes(fileName);
        commands = new Command[]{
            new Command(
            "list",
            "lists the recipes",
            new Command.CommandAction() {
                @Override
                public boolean execute(Scanner scanner, Recipes recipes) {
                    System.out.println("");
                    recipes.list();
                    return true;
                }
            }),
            new Command(
            "stop",
            "stops the program",
            new Command.CommandAction() {
                @Override
                public boolean execute(Scanner scanner, Recipes recipes) {
                    System.out.println("");
                    return false;
                }
            }),
            new Command(
            "find name",
            "searches recipes by name",
            new Command.CommandAction() {
                @Override
                public boolean execute(Scanner scanner, Recipes recipes) {
                    System.out.println("Searched word:");
                    String word = scanner.nextLine();
                    System.out.println("");
                    recipes.findName(word);
                    return true;
                }
            }),
            new Command(
            "find cooking time",
            "searches recipes by cooking time",
            new Command.CommandAction() {
                @Override
                public boolean execute(Scanner scanner, Recipes recipes) {
                    System.out.println("Max cooking time:");
                    int time = Integer.valueOf(scanner.nextLine());
                    System.out.println("");
                    recipes.findCookingTime(time);
                    return true;
                }
            }),
            new Command(
            "find ingredient",
            "searches recipes by ingredient",
            new Command.CommandAction() {
                @Override
                public boolean execute(Scanner scanner, Recipes recipes) {
                    System.out.println("Ingredient:");
                    String word = scanner.nextLine();
                    System.out.println("");
                    recipes.findIngredient(word);
                    return true;
                }
            })
        };
    }

    public boolean executeCommand(String cmd) {
        for (Command command : this.commands) {
            if (command.getName().equals(cmd)) {
                return command.run(this.scanner, this.recipes);
            }
        }
        return true;
    }

    public void printCommands() {
        for (Command command : this.commands) {
            System.out.println(command.getName() + " - " + command.getDescription());
        }
    }
}
