
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            int var = Integer.valueOf(scr.nextLine());
            if (var == 0) {
                break;
            }
            counter = counter + 1;
        }
        System.out.println("Number of numbers: " + counter);
    }
}
