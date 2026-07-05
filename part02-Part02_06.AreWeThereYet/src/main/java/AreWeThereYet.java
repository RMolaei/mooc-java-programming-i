
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        /* solution A */
        while (true) {
            System.out.println("Give a number:");
            int var = Integer.valueOf(scr.nextLine());
            if (var == 4) {
                break;
            }
        }
        /* solution B */
//        int var = 0;
//        while (var != 4) {
//            System.out.println("Give a number:");
//            var = Integer.valueOf(scr.nextLine());
//        }
    }
}
