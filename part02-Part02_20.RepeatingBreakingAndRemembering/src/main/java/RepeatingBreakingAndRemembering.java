
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scr = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int numbers = 0;
        double average;
        int evenNumbers = 0;
        int oddNumbers = 0;
        while (true) {
            int var = Integer.valueOf(scr.nextLine());
            if (var == -1) {
                break;
            }
            sum = sum + var;
            numbers++;
            if (var % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        average = 1.0 * sum / numbers;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}
