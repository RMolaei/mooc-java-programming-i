/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author Molaei
 */
public class Points {

    private ArrayList<Integer> points;

    public Points() {
        this.points = new ArrayList<>();
    }

    public void add(int point) {
        if (0 <= point && point <= 100) {
            this.points.add(point);
        }
    }

    public double sum() {
        double sum = 0;
        for (int point : this.points) {
            sum += point;
        }
        return sum;
    }

    public double passingSum() {
        double sum = 0;
        for (int point : this.points) {
            if (point >= 50) {
                sum += point;
            }
        }
        return sum;
    }

    public int pointsNum() {
        return this.points.size();
    }

    public int passingPointsNum() {
        int num = 0;
        for (int point : this.points) {
            if (point >= 50) {
                num++;
            }
        }
        return num;
    }

    public int[] grade() {
        int[] grade = {0, 0, 0, 0, 0, 0};
        for (int point : this.points) {
            if (point < 50) {
                grade[0]++;
            } else if (50 <= point && point < 60) {
                grade[1]++;
            } else if (60 <= point && point < 70) {
                grade[2]++;
            } else if (70 <= point && point < 80) {
                grade[3]++;
            } else if (80 <= point && point < 90) {
                grade[4]++;
            } else {
                grade[5]++;
            }
        }
        return grade;
    }

    public static void gradeDistribution (int[] grade) {
        System.out.println("Grade distribution:");
        for (int index = grade.length-1; 0 <= index; index--) {
            System.out.print(index + ": ");
            for (int jndex = 0; jndex < grade[index]; jndex++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
