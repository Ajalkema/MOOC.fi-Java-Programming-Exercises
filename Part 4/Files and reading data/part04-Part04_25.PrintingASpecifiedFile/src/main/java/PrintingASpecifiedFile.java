
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);

        System.out.println("Which file should we print? ");
        String input = userScanner.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(input))) {
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } 
        catch (Exception e){
            System.out.println("Error: " + e);
        }

        userScanner.close();
    }
}
