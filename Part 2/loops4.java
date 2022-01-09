import java.util.Scanner;

public class loops4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start: ");
        int start = Integer.valueOf(scanner.nextLine());

        System.out.println("End: ");
        int end = Integer.valueOf(scanner.nextLine());

        if (start < end) {
            for (int i = start; i < (end+1); i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
