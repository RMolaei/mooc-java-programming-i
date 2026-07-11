
import java.util.Scanner;

public class AVClub {
    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while (true) {
            String str = scr.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] strArray = str.split(" ");
            for (String strElement : strArray) {
                if (strElement.contains("av")) {
                    System.out.println(strElement);
                }
            }
        }
    }
}
