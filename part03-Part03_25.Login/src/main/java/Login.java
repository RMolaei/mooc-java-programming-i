
import java.util.Scanner;
import java.util.ArrayList;

public class Login {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        ArrayList<String> username = new ArrayList<String>();
        ArrayList<String> password = new ArrayList<String>();

        username.add("alex");
        password.add("sunshine");

        username.add("emma");
        password.add("haskell");

        System.out.println("Enter username:");
        String usr = scr.nextLine();
        System.out.println("Enter password:");
        String psd = scr.nextLine();

        boolean login = false;
        for (int index = 0; index < username.size(); index++) {
            if (usr.equals(username.get(index))) {
                if (psd.equals(password.get(index))) {
                    login = true;
                    break;
                }
                break;
            }
        }

        if (login) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
