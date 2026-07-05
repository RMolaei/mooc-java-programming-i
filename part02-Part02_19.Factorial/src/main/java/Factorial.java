
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.valueOf(scr.nextLine());
        int factorial = 1;
        int index = number;
        while (index > 0) {
            if (number == 0 || number == 1) {
                break;
            }
            factorial = factorial * index;
            index--;
        }
        System.out.println("Factorial: " + factorial);
    }
}
