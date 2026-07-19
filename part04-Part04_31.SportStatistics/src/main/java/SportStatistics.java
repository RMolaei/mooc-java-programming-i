
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanUser = new Scanner(System.in);
        System.out.println("File:");
        String strFile = scanUser.nextLine();
        System.out.println("Team:");
        String strTeam = scanUser.nextLine();
        int gamesCount = 0;
        int winsCount = 0;
        int lossesCount = 0;
        try ( Scanner scanFile = new Scanner(Paths.get(strFile))) {
            while (scanFile.hasNextLine()) {
                String strRow = scanFile.nextLine();
                String[] strParts = strRow.split(",");
                if (strParts[0].equals(strTeam)) {
                    gamesCount++;
                    if (Integer.valueOf(strParts[2]) > Integer.valueOf(strParts[3])) {
                        winsCount++;
                    }
                    if (Integer.valueOf(strParts[2]) < Integer.valueOf(strParts[3])) {
                        lossesCount++;
                    }
                }
                if (strParts[1].equals(strTeam)) {
                    gamesCount++;
                    if (Integer.valueOf(strParts[3]) > Integer.valueOf(strParts[2])) {
                        winsCount++;
                    }
                    if (Integer.valueOf(strParts[3]) < Integer.valueOf(strParts[2])) {
                        lossesCount++;
                    }
                }
            }
        } catch (Exception err) {
            System.out.println("Erorr: " + err.getMessage());
        }
        System.out.println("Games: " + gamesCount);
        System.out.println("Wins: " + winsCount);
        System.out.println("Losses: " + lossesCount);
    }

}
