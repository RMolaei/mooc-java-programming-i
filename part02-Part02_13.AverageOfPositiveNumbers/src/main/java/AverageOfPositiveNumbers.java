
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int positiveNum = 0;
        double positiveSum = 0;
        while (true) {
            double var = Double.valueOf(scr.nextLine());
            if (var == 0) {
                break;
            }
            if (var < 0) {
                continue;
            }
            positiveNum++;
            positiveSum = positiveSum + var;
        }
        if (positiveSum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double positiveAverage = positiveSum / positiveNum;
            System.out.println(positiveAverage);
        }
    }
}
