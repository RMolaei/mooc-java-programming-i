
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // Write your program here
        String str = scr.nextLine();
        str = str + str + str;
        System.out.println(str);
    }
}
