import java.util.Scanner;
import java.util.ArrayList;

public class IndexOf {
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

        System.out.println("Welke nummer zoek je?");
        int indexOf = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < length; i++) {
            if (intList.get(i) == indexOf) {
                System.out.println("Index of number " + indexOf + " is: " + i);
            }
        }        

        scanner.close();
    }
}