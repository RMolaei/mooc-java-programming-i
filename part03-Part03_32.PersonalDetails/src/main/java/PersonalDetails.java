
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ArrayList<String[]> strArrayArrayList = new ArrayList<String[]>();
        String longestName = "";
        double birthYearsAverage;

        while (true) {
            String str = scr.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] strArray = str.split(",");
            strArrayArrayList.add(strArray);
        }

        for (String[] strArray : strArrayArrayList) {
            String str = strArray[0];
            if (longestName.length() < str.length()) {
                longestName = str;
            }
        }

        double birthYearsSum = 0.0;
        for (String[] strArray : strArrayArrayList) {
            birthYearsSum = birthYearsSum + Double.valueOf(strArray[1]);
        }

        if (strArrayArrayList.size() > 0) {
            System.out.println("Longest name: " + longestName);
            birthYearsAverage = birthYearsSum / strArrayArrayList.size();
            System.out.println("Average of the birth years: " + birthYearsAverage);
        }
    }
}
