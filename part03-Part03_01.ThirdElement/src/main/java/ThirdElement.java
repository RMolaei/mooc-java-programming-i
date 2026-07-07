
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        ArrayList<String> listVar = new ArrayList<>();
        while (true) {
            String input = scr.nextLine();
            if (input.equals("")) {
                break;
            }

            listVar.add(input);
        }

        System.out.println(listVar.get(2));
    }
}
