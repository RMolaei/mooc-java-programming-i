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
public class Command {

    private String name;
    private String description;
    private CommandAction action;

    interface CommandAction {
        boolean execute(Scanner scanner, Recipes recipes);
    }

    public Command(String name, String description, CommandAction action) {
        this.name = name;
        this.description = description;
        this.action = action;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean run(Scanner scanner, Recipes recipes) {
        return this.action.execute(scanner, recipes);
    }
}
