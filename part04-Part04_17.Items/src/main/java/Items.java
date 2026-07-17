
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scr = new Scanner(System.in);

        while (true) {
            System.out.println("Name:");
            String strName = scr.nextLine();
            if (strName.equals("")) {
                break;
            }
            items.add(new Item(strName));
        }

        for (Item itemVar : items) {
            System.out.println(itemVar);
        }
    }
}
