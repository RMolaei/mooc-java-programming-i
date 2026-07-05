
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("How old are you?");
        int oldVar = Integer.valueOf(scr.nextLine());
        if (0 <= oldVar && oldVar <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
