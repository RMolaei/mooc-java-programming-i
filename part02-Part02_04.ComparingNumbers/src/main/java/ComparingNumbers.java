
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int varA = Integer.valueOf(scr.nextLine());
        int varB = Integer.valueOf(scr.nextLine());
        String str = "";
        if (varA > varB) {
            str = varA + " is greater than " + varB + ".";
        } else if (varA < varB) {
            str = varA + " is smaller than " + varB + ".";
        } else {
            str = varA + " is equal to " + varB + ".";
        }
        System.out.println(str);
    }
}
