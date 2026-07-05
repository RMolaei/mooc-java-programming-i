
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // Write your program here
        System.out.println("Give the first number:");
        int num_first = Integer.valueOf(scr.nextLine());
        System.out.println("Give the second number:");
        int num_second = Integer.valueOf(scr.nextLine());
        double average = 1.0*(num_first + num_second)/2;
        System.out.println("The average is " + average);
    }
}
