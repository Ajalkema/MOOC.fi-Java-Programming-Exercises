import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();
        
        System.out.println("Type 3 names. Empty = exit");

        while (true) {
            String name = scanner.nextLine();
            if (name == "") {
                break;
            }
            nameList.add(name);
        }

        System.out.println("Search who?");

        String dude = scanner.nextLine();

        if (nameList.contains(dude)) {
            System.out.println("Woooooh!");
        } else {
            System.out.println("Jammer!");
        }

        scanner.close();
    }
}