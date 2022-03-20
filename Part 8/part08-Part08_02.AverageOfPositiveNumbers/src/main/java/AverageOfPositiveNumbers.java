
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPositive = 0;
        int sumPositive = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) break;
            if (num > 0) {
                sumPositive+=num;
                countPositive++;
            }
        }
        
        if (countPositive > 0) System.out.println(1.0 * sumPositive / countPositive);
        else System.out.println("Cannot calculate the average");
    }
}
