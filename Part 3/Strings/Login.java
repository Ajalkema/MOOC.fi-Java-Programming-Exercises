import java.util.Scanner;
public class Login {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userName = reader.nextLine();
        System.out.print("Enter password: ");
        String passWord = reader.nextLine();

        if (userName.equals("alex") && passWord.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        } else if (userName.equals("emma") && passWord.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

        reader.close();
    }
}
