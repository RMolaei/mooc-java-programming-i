
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int var = Integer.valueOf(scr.nextLine());
            if (var == 0) {
                break;
            }
            num++;
            sum = sum + var;
        }
        System.out.println("Number of numbers: " + num);
        System.out.println("Sum of the numbers: " + sum);
    }
}
