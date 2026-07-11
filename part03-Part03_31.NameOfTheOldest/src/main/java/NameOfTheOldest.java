
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ArrayList<String[]> strArrayArrayList = new ArrayList<String[]>();
        int oldestAge = 0;
        String oldestName = "";

        while (true) {
            String strExpression = scr.nextLine();
            if (strExpression.equals("")) {
                break;
            }
            String[] strArray = strExpression.split(",");
            strArrayArrayList.add(strArray);
        }

        for (String[] strArray : strArrayArrayList) {
            int age = Integer.valueOf(strArray[1]);
            if (oldestAge < age) {
                oldestAge = age;
                oldestName = strArray[0];
            }
        }

        if (strArrayArrayList.size() > 0) {
            System.out.println("Name of the oldest: " + oldestName);
        }
    }
}
