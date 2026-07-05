
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // Write your program here
        System.out.println("Give the first number:");
        int num_first = Integer.valueOf(scr.nextLine());
        System.out.println("Give the second number:");
        int num_second = Integer.valueOf(scr.nextLine());
        System.out.println("Give the third number:");
        int num_third = Integer.valueOf(scr.nextLine());
        System.out.println("The average is " + 1.0*(num_first + num_second + num_third)/3);
    }
}
