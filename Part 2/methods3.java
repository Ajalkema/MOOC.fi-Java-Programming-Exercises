import java.util.Scanner;

public class methods3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int begin = Integer.valueOf(scanner.nextLine());
        int end = Integer.valueOf(scanner.nextLine());

        divisableByThreeInRange(begin, end);

        scanner.close();
    }

    public static void divisableByThreeInRange(int begin, int end) {
        for (int i = begin; i < (end + 1); i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
