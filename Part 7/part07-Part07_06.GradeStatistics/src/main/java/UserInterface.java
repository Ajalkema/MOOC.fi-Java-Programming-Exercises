import java.util.*;

public class UserInterface {
    private Scanner scanner;
    private Grades grades;

    public UserInterface(Scanner scanner, Grades grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) break;
            
            this.grades.add(input);
        }

        System.out.println("Point average (all): " + grades.pointsAverage());
        System.out.println("Point average (passing): " + grades.pointsAverageOfPassingGrade());
        System.out.println("Pass percentage: " + grades.passPercentage());
        grades.printDistribution();

    }
}
