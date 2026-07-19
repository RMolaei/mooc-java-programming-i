
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scrUser = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scrUser.nextLine();

        try ( Scanner scrFile = new Scanner(Paths.get(file))) {
            while (scrFile.hasNextLine()) {
                String strRow = scrFile.nextLine();
                String[] strParts = strRow.split(",");
                String name = strParts[0];
                int age = Integer.valueOf(strParts[1]);
                System.out.print(name + ", age: " + age + " ");
                if (age == 1) {
                    System.out.println("year");
                } else {
                    System.out.println("years");
                }
            }
        } catch (Exception err) {
            System.out.println("Erorr: " + err.getMessage());
        }
    }
}
