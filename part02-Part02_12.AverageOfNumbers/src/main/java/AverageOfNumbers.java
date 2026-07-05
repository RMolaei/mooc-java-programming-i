
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num = 0;
        double sum = 0;
        while (true) {
            System.out.println("Give a number:");
            double var = Double.valueOf(scr.nextLine());
            if (var == 0) {
                if (num == 0) {
                    num++;
                }
                break;
            }
            num++;
            sum = sum + var;
        }
        double average = sum / num;
        System.out.println("Average of the numbers: " + average);
    }
}
