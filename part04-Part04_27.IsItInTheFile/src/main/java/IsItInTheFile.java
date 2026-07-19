
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        boolean fileErr = false;
        try (Scanner scrFile = new Scanner(Paths.get(file))) {
            while (scrFile.hasNextLine()) {
                String strVar = scrFile.nextLine();
                list.add(strVar);
            }
        } catch (Exception err) {
            System.out.println("Error: " + err.getMessage());
            fileErr = true;
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        if (fileErr) {
            System.out.println("Reading the file " + file + " failed.");
        } else if (list.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
