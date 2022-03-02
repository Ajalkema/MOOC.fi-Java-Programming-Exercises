
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];            

            if (command.equals("quit")) {
                break;
            }
            if (command.equals("add")) {
                int num = Integer.valueOf(parts[1]);
                if (num > 0) {
                    if ((firstContainer + num) <= 100) firstContainer+=num;
                    else firstContainer = 100;
                }                
            }
            if (command.equals("move")) {
                int num = Integer.valueOf(parts[1]);
                if (num > 0) {
                    if (firstContainer - num >= 0) {
                        firstContainer-=num;
                        if (secondContainer + num <= 100) secondContainer+=num;
                        else secondContainer = 100;
                    } else { 
                        if (secondContainer + firstContainer <= 100) {
                            secondContainer+=firstContainer;
                            firstContainer = 0;
                        }
                        else secondContainer = 100;
                    }
                }
            }
            if (command.equals("remove")){
                int num = Integer.valueOf(parts[1]);
                if (num > 0) {
                    if (secondContainer - num >= 0) secondContainer-=num;
                    else secondContainer = 0;
                }
            }

        }
        scan.close();
    }

}
