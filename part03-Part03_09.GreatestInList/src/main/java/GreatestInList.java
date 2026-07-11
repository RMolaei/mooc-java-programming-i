
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

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

        // implement finding the greatest number in the list here
        int maximum = list.get(0);
        int var;
        for (int index = 1; index < list.size(); index++) {
            var = list.get(index);
            if (maximum < var) {
                maximum = var;
            }
        }
        System.out.println("The greatest number: " + maximum);
    }
}
