
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        int numGames = 0;
        int numGamesWon = 0;
        int numGamesLost = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(file))){ 
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                if (row.equals("")) continue;

                String[] parts = row.split(",");
                if (parts[0].equals(team)) {
                    numGames++;
                    if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        numGamesWon++;
                    } else numGamesLost++;
                } if (parts[1].equals(team)) {
                    numGames++;
                    if (Integer.valueOf(parts[2]) < Integer.valueOf(parts[3])) {
                        numGamesWon++;
                    } else numGamesLost++;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Games: " + numGames);
        System.out.println("Wins: " + numGamesWon);
        System.out.println("Losses: " + numGamesLost);

        scan.close();
    }

}
