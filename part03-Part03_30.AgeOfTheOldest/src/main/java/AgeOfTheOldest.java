
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ArrayList<String[]> strArrayArrayLisr = new ArrayList<String[]>();
        int oldestAge = 0;

        while (true) {
            String strExpression = scr.nextLine();
            if (strExpression.equals("")) {
                break;
            }
            String[] strArray = strExpression.split(",");
            strArrayArrayLisr.add(strArray);
        }

        for (String[] strArray : strArrayArrayLisr) {
            int age = Integer.valueOf(strArray[1]);
            if (oldestAge < age) {
                oldestAge = age;
            }
        }

        if (strArrayArrayLisr.size() > 0) {
            System.out.println("Age of the oldest: " + oldestAge);
        }
    }
}
