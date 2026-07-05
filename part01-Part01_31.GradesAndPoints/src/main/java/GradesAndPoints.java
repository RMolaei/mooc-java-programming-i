
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        double point = Double.valueOf(scr.nextLine());
        String grade;
        if (point < 0) {
            grade = "impossible!";
        } else if (point < 50) {
            grade = "failed";
        } else if (point < 60) {
            grade = "1";
        } else if (point < 70) {
            grade = "2";
        } else if (point < 80) {
            grade = "3";
        } else if (point < 90) {
            grade = "4";
        } else if (point <= 100) {
            grade = "5";
        } else {
            grade = "incredible!";
        }
        System.out.println("Grade: " + grade);
    }
}
