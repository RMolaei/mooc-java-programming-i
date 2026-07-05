
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // Write your program here
        System.out.println("Give a string:");
        String srtVar = scr.nextLine();
        System.out.println("Give an integer:");
        int intVar = Integer.valueOf(scr.nextLine());
        System.out.println("Give a double:");
        double fpVar = Double.valueOf(scr.nextLine());
        System.out.println("Give a boolean:");
        boolean booleanVar = Boolean.valueOf(scr.nextLine());
        System.out.println("You gave the string " + srtVar);
        System.out.println("You gave the integer " + intVar);
        System.out.println("You gave the double " + fpVar);
        System.out.println("You gave the boolean " + booleanVar);
    }
}
