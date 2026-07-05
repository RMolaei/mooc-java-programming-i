
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // Write your program here
        System.out.println("What's your name?");
        String msg = scr.nextLine();
        System.out.println("Hi " + msg);
    }
}
