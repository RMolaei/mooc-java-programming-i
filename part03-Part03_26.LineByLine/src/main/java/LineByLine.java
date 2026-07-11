
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while (true) {
            String str = scr.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] strArray = str.split(" ");
            for (int index = 0; index < strArray.length; index++) {
                System.out.println(strArray[index]);
            }
        }
    }
}
