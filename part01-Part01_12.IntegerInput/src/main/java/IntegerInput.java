
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // write your program here
        System.out.println("Give a number:");
        int intVar = Integer.valueOf(scr.nextLine());
        System.out.println("You gave the number " + intVar);
    }
}
