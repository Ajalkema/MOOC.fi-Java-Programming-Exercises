import java.util.Scanner;

public class methods1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.valueOf(scanner.nextLine());

        greet(num);

        scanner.close();
    }

    public static void greet(int numOfTimes) {
        for (int i=numOfTimes; i > 0; i--) {
            System.out.println(i + "\n");
        }
    }
}
