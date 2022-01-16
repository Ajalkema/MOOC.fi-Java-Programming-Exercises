import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give tv-programs and its duration seperated by a comma");

        while (true) {            
            System.out.print("Name: ");
            String programName = scanner.nextLine();
            if (programName.equals("")) {
                break;
            }
            System.out.print("Duration: ");
            int programDuration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(programName, programDuration));
        }
        
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram show: programs) {
            if (show.getDuration() <= maxDuration) {
                System.out.println(show);
            }
        }

        scanner.close();
    }
}
