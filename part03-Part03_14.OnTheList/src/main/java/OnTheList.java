
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scr.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        String str = scr.nextLine();
        if (list.contains(str)) {
            System.out.println(str + " was found!");
        } else {
            System.out.println(str + " was not found!");
        }
    }
}
