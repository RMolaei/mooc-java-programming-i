
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        Scanner scn = new Scanner(System.in);
        String msg;
        System.out.println("Hello Java!");
        do 
        {
            msg = scn.nextLine();
            System.out.println("Hello " + msg);
        }
        while (!msg.equals("Bye"));
    }
}
