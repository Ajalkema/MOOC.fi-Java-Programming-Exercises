import java.util.*;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            procesCommand(command);
        }
    }

    public void procesCommand(String command) {
        if (command.equals("add")) add();
        if (command.equals("list")) this.list.print();
        if (command.equals("remove")) remove();
    }

    public void add() {
        System.out.print("To add: ");
        String toAdd = scanner.nextLine();
        this.list.add(toAdd);
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int toRemove = Integer.valueOf(scanner.nextLine());
        this.list.remove(toRemove); 
    }
}
