
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] var = {0, 0};
        var[0] = Integer.valueOf(scr.nextLine());
        var[1] = Integer.valueOf(scr.nextLine());
        int result = (int) Math.sqrt(Math.abs(var[0] + var[1]));
        System.out.println(result);
    }
}
