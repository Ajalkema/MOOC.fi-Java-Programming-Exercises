
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];            

            if (command.equals("quit")) {
                break;
            }
            if (command.equals("add")) {
                int num = Integer.valueOf(parts[1]);
                firstContainer.add(num);
            }
            if (command.equals("move")) {
                int num = Integer.valueOf(parts[1]);
                if (firstContainer.contains() - num >= 0) {
                    firstContainer.remove(num);
                    secondContainer.add(num);
                } else {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(num);
                }

            }
            if (command.equals("remove")){
                int num = Integer.valueOf(parts[1]);
                secondContainer.remove(num);
            }

        }
        scan.close();
    }

}
