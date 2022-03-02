import java.util.*;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) break;

            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if(command.equals("Add")) addBird();
        if(command.equals("Observation")) observation();
        if(command.equals("All")) printAllBirds();
        if(command.equals("One")) printOneBird();
    }

    public void addBird() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();

        Bird newBird = new Bird(name, latinName);

        boolean isUnique = true;
        for (Bird b : birds) {
            if (b.isEqual(newBird)) isUnique = false;
        }
        if (isUnique) birds.add(newBird);
    }

    public void observation() {
        System.out.print("Bird? ");
        String observedBird = scanner.nextLine();
        boolean notFound = true;

        for (Bird b : birds) {
            if (b.getName().equals(observedBird)) b.birdCountPlus();
            notFound = false;
        }
        if (notFound) System.out.println("Not a bird!");
    }

    public void printAllBirds() {
        for (Bird b : birds) {
            System.out.println(b);
        }
    }

    public void printOneBird() {
        System.out.print("Bird? ");
        String searchedBird = scanner.nextLine();
        for (Bird b : birds) {
            if (b.getName().equals(searchedBird)) System.out.println(b);            
        }
    }
}
