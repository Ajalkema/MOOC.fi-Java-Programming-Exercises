import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {
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

        System.out.println("Last name was: " + nameList.get(nameList.size()-1));

        scanner.close();
    }
}
