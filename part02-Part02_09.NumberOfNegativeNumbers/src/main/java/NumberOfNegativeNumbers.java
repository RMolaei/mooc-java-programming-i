
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            double var = Double.valueOf(scr.nextLine());
            if (var==0) {
                break;
            }
            if (var>0) {
                continue;
            }
            counter = counter + 1;
        }
        System.out.println("Number of negative numbers: " + counter);
    }
}
