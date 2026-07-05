
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        /* solution A */
        while (true) {
            System.out.println("Shall we carry on?");
            String str = scr.nextLine();
            if (str.equals("no")) {
                break;
            }
        }
        /* solution B */
//        String str = "";
//        while (!str.equals("no")) {
//            System.out.println("Shall we carry on?");
//            str = scr.nextLine();
//        }
    }
}
