
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int var = Integer.valueOf(scr.nextLine());
        int pow2 = (int) Math.pow(var, 2);
        System.out.println(pow2);
    }
}
