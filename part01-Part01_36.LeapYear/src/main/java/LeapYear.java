
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Give a year:");
        int numVar = Integer.valueOf(scr.nextLine());
        if (numVar % 100 == 0 && numVar % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else if (numVar % 100 != 0 && numVar % 4 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
