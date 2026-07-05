
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // Write your program here
        System.out.println("Give the first number:");
        int num_first = Integer.valueOf(scr.nextLine());
        System.out.println("Give the second number:");
        int num_second = Integer.valueOf(scr.nextLine());
        System.out.println("The sum of the numbers is " + (num_first+num_second));
    }
}