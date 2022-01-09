import java.util.Scanner;
import java.util.ArrayList;

public class GreatestInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();

        System.out.println("Roep eens wat nummers:");

        while (true) {
            int integer = Integer.valueOf(scanner.nextLine());
            if (integer == -1) {
                break;
            } 
            intList.add(integer);
        }

        int length = intList.size();
        int greatest = intList.get(0);
        for (int i = 0; i < length; i++) {
            if (intList.get(i) > greatest) {
                greatest = intList.get(i);
            }
        }

        System.out.println("Greatest: " + greatest);

        scanner.close();
    }
}
