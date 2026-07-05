
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // Write your program here.
        System.out.println("Give speed:");
        int numVar = Integer.valueOf(scr.nextLine());
        if (numVar>120)
        {
            System.out.println("Speeding ticket!");
        }
    }
}
