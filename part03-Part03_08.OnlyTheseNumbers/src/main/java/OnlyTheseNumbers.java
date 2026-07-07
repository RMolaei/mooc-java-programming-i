
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scr.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        System.out.println("From where?");
        int startIndex = Integer.valueOf(scr.nextLine());
        System.out.println("To where?");
        int stopIndex = Integer.valueOf(scr.nextLine());

        for (int index = startIndex; index <= stopIndex; index++) {
            System.out.println(numbers.get(index));
        }
    }
}
