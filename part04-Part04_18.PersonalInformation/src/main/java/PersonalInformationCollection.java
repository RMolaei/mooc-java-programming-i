
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scr = new Scanner(System.in);

        while (true) {
            String[] strVar = new String[3];
            System.out.println("First name:");
            strVar[0] = scr.nextLine();
            if (strVar[0].equals("")) {
                break;
            }
            System.out.println("Last name:");
            strVar[1] = scr.nextLine();
            System.out.println("Identification number:");
            strVar[2] = scr.nextLine();
            infoCollection.add(new PersonalInformation(strVar[0], strVar[1], strVar[2]));
        }

        if (infoCollection.isEmpty()) {
            return;
        }

        for (PersonalInformation pInfo : infoCollection) {
            System.out.println(pInfo.getFirstName() + " " + pInfo.getLastName());
        }
    }
}
