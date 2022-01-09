import java.util.Scanner;

public class loops6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int i = 0;

        int even = 0;
        int odd = 0;

        System.out.println("Print numbers: ");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                System.out.println("Thanks! Bye!");
                break;
            }

            if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }

            i += 1;
            sum += num;
        }

        System.out.println("Numbers: " + i);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / i));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        scanner.close();
    }
}
