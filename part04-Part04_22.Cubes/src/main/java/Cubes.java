
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while (true) {
            String strVar = scr.nextLine();
            if (strVar.equals("end")) {
                break;
            }
            int var = Integer.valueOf(strVar);
            int cube = var * var * var;
            System.out.println(cube);
        }
    }
}
