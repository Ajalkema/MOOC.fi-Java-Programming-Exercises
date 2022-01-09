import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
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

        System.out.println("List size: " + nameList.size());

        scanner.close();
    }
}
