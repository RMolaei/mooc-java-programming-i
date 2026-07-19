
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try ( Scanner scr = new Scanner(Paths.get("data.txt"))) {
            while (scr.hasNextLine()) {
                String strVar = scr.nextLine();
                System.out.println(strVar);
            }
        } catch (Exception err) {
            System.out.println("Error: " + err.getMessage());
        }
    }
}
