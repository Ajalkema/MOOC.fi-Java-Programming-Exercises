import java.util.*;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) break;

            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) addTask();
        if (command.equals("list")) list.print();
        if (command.equals("remove")) removeTask();
    }

    public void addTask() {
        System.out.print("To add: ");
        String task = scanner.nextLine();

        list.add(task);
    }

    public void removeTask() {
        System.out.print("Which one is removed? ");
        int taskToBeRemoved = Integer.valueOf(scanner.nextLine());

        list.remove(taskToBeRemoved);
    }
}
