
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Where to?");
        int whereTo = Integer.valueOf(scr.nextLine());
        System.out.println("Where from?");
        int whereFrom = Integer.valueOf(scr.nextLine());
        int counter = whereFrom;
        while (true) {
            if (whereTo < whereFrom) {
                break;
            }
            if (whereTo < counter) {
                break;
            }
            System.out.println(counter);
            counter++;
        }
    }
}
