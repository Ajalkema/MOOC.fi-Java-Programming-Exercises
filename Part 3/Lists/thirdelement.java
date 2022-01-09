import java.util.ArrayList;
import java.util.Scanner;

public class thirdelement {
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

        System.out.println("3rd name is: " + nameList.get(2));

        scanner.close();
    }
}
