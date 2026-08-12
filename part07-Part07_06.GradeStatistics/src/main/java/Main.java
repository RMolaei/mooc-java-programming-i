
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Points pointsList = new Points();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.valueOf(scr.nextLine());
            if (point == -1) {
                break;
            }
            pointsList.add(point);
        }

        System.out.println("Point average (all): " + pointsList.sum() / pointsList.pointsNum());

        if (pointsList.passingPointsNum() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + pointsList.passingSum() / pointsList.passingPointsNum());
        }

        System.out.println("Pass percentage: " + 100.0 * pointsList.passingPointsNum() / pointsList.pointsNum());

        Points.gradeDistribution(pointsList.grade());
    }

}
