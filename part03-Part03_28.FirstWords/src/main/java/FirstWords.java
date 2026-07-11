
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while (true) {
            String strExpression = scr.nextLine();
            if (strExpression.equals("")) {
                break;
            }
            String[] strArray = strExpression.split(" ");
            System.out.println(strArray[0]);
        }
    }
}
