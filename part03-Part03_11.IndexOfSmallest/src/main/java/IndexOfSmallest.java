
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scr.nextLine());
            if (number == 9999) {
                break;
            }
            list.add(number);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = list.get(0);
        int var;
        for (int index = 1; index < list.size(); index++) {
            var = list.get(index);
            if (smallest > var) {
                smallest = var;
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int index = 0; index < list.size(); index++) {
            var = list.get(index);
            if (smallest == var) {
                System.out.println("Found at index: " + index);
            }
        }
    }
}
