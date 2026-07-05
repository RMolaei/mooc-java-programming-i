
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Last number?");
        int index = Math.abs(Integer.valueOf(scr.nextLine()));
        int sum = 0;
        while (index>0) {
            sum = sum + index;
            index--;
        }
        System.out.println("The sum is " + sum);
    }
}
