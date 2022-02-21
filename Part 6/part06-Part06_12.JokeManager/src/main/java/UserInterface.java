import java.util.Scanner;

public class UserInterface {
    
    private JokeManager jManager;
    private Scanner scanner;

    public UserInterface(JokeManager Manager, Scanner scanner) {
        this.jManager = Manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();

            if (command.equals("X")) break;

            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("1")) addJoke();
        if (command.equals("2")) drawJoke();
        if (command.equals("3")) this.jManager.printJokes(); 
    }

    public void addJoke () {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        jManager.addJoke(joke);
    }

    public void drawJoke() {
        System.out.println("Drawing a joke.");
        System.out.println(jManager.drawJoke());
    }


}
