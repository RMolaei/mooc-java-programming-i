
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scr.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.println("Search for?");
        int number = Integer.valueOf(scr.nextLine());
        int var;
        for (int index = 0; index < list.size(); index++) {
            var = list.get(index);
            if (number == var) {
                System.out.println(var + " is at index " + index);
            }
        }
    }
}
