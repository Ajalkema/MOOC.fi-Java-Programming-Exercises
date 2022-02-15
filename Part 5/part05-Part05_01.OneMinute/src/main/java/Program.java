
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println(timer);
            timer.advance();
            
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
        }        

    }
}
