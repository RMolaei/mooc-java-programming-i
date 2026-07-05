
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int var = Integer.valueOf(scr.nextLine());
        for (int index = var; index <= 100; index++) {
            System.out.println(index);
        }
    }
}
