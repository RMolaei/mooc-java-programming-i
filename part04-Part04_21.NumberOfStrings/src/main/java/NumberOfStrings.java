
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int wordCounter = 0;
        while (true) {
            String strVar = scr.nextLine();
            if (strVar.equals("end")) {
                break;
            }
            wordCounter++;
        }
        System.out.println(wordCounter);
    }
}
