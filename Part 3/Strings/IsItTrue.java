import java.util.Scanner;

public class IsItTrue {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give a string: ");
        String input = reader.nextLine();

        if (input.equals("true")) {
            System.out.println("Well done");
        } else {
            System.out.println("Try again");
        }

        reader.close();
    }
}
