import java.util.*;

public class Grades {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public Grades() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void add(int points) {
        if (points >= 0 && points <= 100) {
            this.points.add(points);
            this.grades.add(convertPointsToGrades(points));
        }
    }

    public double pointsAverage() {
        int sum = 0;
        for (int i : points) {
            sum += i;
        }
        return 1.0 * sum / points.size();
    }

    public String pointsAverageOfPassingGrade() {
        int sum = 0;
        int count = 0;
        for (int i : points) { 
            if (i >= 50) {
                sum += i;
                count++;
            }
        }
        if (sum == 0) return "-";
        double average = 1.0 * sum / count;
        return average + "";
    }

    public double passPercentage() {
        int passingCount = 0;
        int numParticipants = points.size();
        for (int i : points) {
            if (i >= 50) {
                passingCount++;
            }
        }
        return 100.0 * passingCount / numParticipants;
    }

    public void printDistribution() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            int gradeCount = 0;
            for (int grade : grades) {
                if (i == grade) gradeCount++;
            }
            System.out.println(i + ": " + printStars(gradeCount));

        }
    }

    public String printStars(int amount) {
        String stars = "";
        for (int i = 0; i < amount; i++) {
            stars+="*";
        }
        return stars;
    }

    public int convertPointsToGrades(int points) {
        if (points < 50) return 0;
        if (points < 60) return 1;
        if (points < 70) return 2;
        if (points < 80) return 3;
        if (points < 90) return 4;
        return 5;
    }
}
