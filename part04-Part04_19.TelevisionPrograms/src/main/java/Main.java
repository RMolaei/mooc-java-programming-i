
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scr = new Scanner(System.in);

        while (true) {
            String[] strVar = new String[2];
            System.out.println("Name:");
            strVar[0] = scr.nextLine();
            if (strVar[0].isEmpty()) {
                break;
            }
            System.out.println("Duration:");
            strVar[1] = scr.nextLine();
            programs.add(new TelevisionProgram(strVar[0], Integer.valueOf(strVar[1])));
        }

        System.out.println("Program's maximum duration?");
        int maxDur = Integer.valueOf(scr.nextLine());
        for (TelevisionProgram tvProg : programs) {
            if (tvProg.getDuration() <= maxDur) {
                System.out.println(tvProg);
            }
        }
    }
}
