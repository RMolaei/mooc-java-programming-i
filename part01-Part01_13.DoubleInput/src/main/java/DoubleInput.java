
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // write your program here
        System.out.println("Give a number:");
        double fpVar = Double.valueOf(scr.nextLine());
        System.out.println("You gave the number " + fpVar);
    }
}
