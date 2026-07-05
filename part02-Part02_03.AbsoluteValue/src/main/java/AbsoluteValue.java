
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double var = Double.valueOf(scr.nextLine());
        /* Solution A */
//        var = Math.abs(var);
        /* Solution B */
        if (var < 0) {
            var = -1 * var;
        }
        /* Output */
        System.out.println((int) var);
    }
}
