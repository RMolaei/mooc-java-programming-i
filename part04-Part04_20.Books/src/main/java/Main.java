
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them
        Scanner scr = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();

        while (true) {
            String[] strVar = new String[3];
            System.out.println("Title:");
            strVar[0] = scr.nextLine();
            if (strVar[0].isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            strVar[1] = scr.nextLine();
            System.out.println("Publication year:");
            strVar[2] = scr.nextLine();
            library.add(new Book(strVar[0], strVar[1], strVar[2]));
        }

        System.out.println("What information will be printed?");
        String strVar = scr.nextLine();

        if (strVar.equals("everything")) {
            for (Book selBook : library) {
                System.out.println(selBook);
            }
        }

        if (strVar.equals("name")) {
            for (Book selBook : library) {
                System.out.println(selBook.getTitle());
            }
        }
    }
}
