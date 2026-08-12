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

    private final String name;
    private final CommandAction action;

    interface CommandAction {
        boolean execute(Scanner scanner, Birds birds);
    }

    public Command(String name, CommandAction action) {
        this.name = name;
        this.action = action;
    }

    public String getName() {
        return this.name;
    }

    public boolean run(Scanner scanner, Birds birds) {
        return this.action.execute(scanner, birds);
    }
}
