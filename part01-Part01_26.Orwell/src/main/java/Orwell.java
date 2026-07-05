
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // Write your program here
        System.out.println("Give a number:");
        int var = Integer.valueOf(scr.nextLine());
        if (var == 1984) {
            System.out.println("Orwell");
        }

    }
}
