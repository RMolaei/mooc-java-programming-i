
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int var = Integer.valueOf(scr.nextLine());
        for (int index = 0; index <= var; index++) {
            System.out.println(index);
        }
    }
}
