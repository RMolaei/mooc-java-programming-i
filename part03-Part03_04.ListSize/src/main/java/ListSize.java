
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

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

        System.out.println("In total: " + list.size());
    }
}
