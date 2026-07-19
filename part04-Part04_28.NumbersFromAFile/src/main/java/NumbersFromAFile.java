
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try ( Scanner scrFile = new Scanner(Paths.get(file))) {
            while (scrFile.hasNextLine()) {
                int var = Integer.valueOf(scrFile.nextLine());
                list.add(var);
            }
        } catch (Exception err) {
            System.out.println("Error :" + err.getMessage());
        }

        int numCounter = 0;
        for (Integer var : list) {
            if (lowerBound <= var && var <= upperBound) {
                numCounter++;
            }
        }

        System.out.println("Numbers: " + numCounter);
    }
}
