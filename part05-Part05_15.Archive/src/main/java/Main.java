
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList();
        ArrayList<Item> listUniq = new ArrayList();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scr.nextLine();
            if (identifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scr.nextLine();
            if (name.equals("")) {
                break;
            }
            Item itemVar = new Item(identifier, name);
            list.add(itemVar);
            if (!(listUniq.contains(itemVar))) {
                listUniq.add(itemVar);
            }
        }

        System.out.println("==Items==");
        for (Item listItem : listUniq) {
            System.out.println(listItem);
        }

    }
}
