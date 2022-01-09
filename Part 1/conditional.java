import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        System.out.println("Wachtwoord!");

        Scanner scanner = new Scanner(System.in);
        String ww = scanner.nextLine();

        if (ww.equals("keutel")) {
            System.out.println("Divisible by 4 or 2?");
            int num = Integer.valueOf(scanner.nextLine());

            if (num % 4 == 0) {
                System.out.println("Divisible by 4!");
            } else if (num % 2 == 0){
                System.out.println("Divisible by 2!");
            } else {
                System.out.println("Not divisible by 4 or 2");
            }
        } else {
            System.out.println("Wieberen!");
        }
        scanner.close();
    }
}
