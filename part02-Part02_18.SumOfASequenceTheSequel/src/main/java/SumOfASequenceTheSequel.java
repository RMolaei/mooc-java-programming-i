
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("First number?");
        int firstNumber = Integer.valueOf(scr.nextLine());
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scr.nextLine());
        int sum = 0;
        if (firstNumber < lastNumber) {
            for (int index = firstNumber; index <= lastNumber; index++) {
                sum = sum + index;
            }
            System.out.println("The sum is " + sum);
        }
    }
}
