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
public class TextUI {

    private Scanner scr;
    private SimpleDictionary dict;

    public TextUI(Scanner scr, SimpleDictionary dict) {
        this.scr = scr;
        this.dict = dict;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String strCmd = scr.nextLine();
            if (strCmd.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (strCmd.equals("add")) {
                this.add();
            } else if (strCmd.equals("search")) {
                this.search();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    private void add() {
        System.out.println("Word:");
        String strWord = scr.nextLine();
        System.out.println("Translation:");
        String strTranslation = scr.nextLine();
        this.dict.add(strWord, strTranslation);
    }

    private void search() {
        System.out.println("To be translated:");
        String strWord = scr.nextLine();
        String strTranslation = this.dict.translate(strWord);
        if (strTranslation == null) {
            System.out.println("Word " + strWord + " was not found");
        } else {
            System.out.println("Translation: " + strTranslation);
        }
    }

}
