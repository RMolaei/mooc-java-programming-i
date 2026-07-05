
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // Write your program here
        System.out.println("Give a year:");
        int yearVar = Integer.valueOf(scr.nextLine());
        if (yearVar<2015) {
            System.out.println("Ancient history!");
        }
    }
}
