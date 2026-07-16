
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics allStatistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics addStatistics = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
            int var = Integer.valueOf(scr.nextLine());
            if (var==-1) {
                break;
            }
            allStatistics.addNumber(var);
            if (var%2==0) {
                evenStatistics.addNumber(var);
            } else {
                addStatistics.addNumber(var);
            }
        }

        System.out.println("Sum: " + allStatistics.sum());
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + addStatistics.sum());
    }
}
