
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int numberOfDay = Integer.valueOf(scr.nextLine());
        int numberOfSecond = numberOfDay*24*60*60;
        System.out.println(numberOfSecond);
    }
}
