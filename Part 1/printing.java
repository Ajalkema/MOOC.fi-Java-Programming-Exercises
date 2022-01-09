import java.util.Scanner;

public class printing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is je naam?");

        String message = scanner.nextLine();

        System.out.println("Jouw naam is " + message);

        System.out.println("Tiep een boolean.");

        Boolean boolian = Boolean.valueOf(scanner.nextLine());

        System.out.println("dat is " + boolian);

        scanner.close();
    }   
}
