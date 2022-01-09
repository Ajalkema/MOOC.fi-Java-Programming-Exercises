import java.util.Scanner;

public class loops5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Factorial: ");
        int lastNum = Integer.valueOf(scanner.nextLine());

        int result = 1;

        for (int i = 1; i < (lastNum +1); i++) {
            result = result * i;
        }

        System.out.println(result);

        scanner.close();
    }
}
