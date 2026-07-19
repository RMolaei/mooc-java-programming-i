
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scrUser = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileNmae = scrUser.nextLine();
        try ( Scanner scrFile = new Scanner(Paths.get(fileNmae))) {
            while (scrFile.hasNextLine()) {
                String strVar = scrFile.nextLine();
                System.out.println(strVar);
            }
        } catch (Exception err) {
            System.out.println("Error :" + err.getMessage());
        }
    }
}
