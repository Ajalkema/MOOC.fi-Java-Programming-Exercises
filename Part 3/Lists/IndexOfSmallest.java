import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfSmallest {
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

        int indexOfSmallest = 0;
        int smallest = intList.get(0);

        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) < smallest) {
                smallest = intList.get(i);
                indexOfSmallest = i;
            }
        }  
        
        System.out.println("Index of smallest is: " + indexOfSmallest);

        scanner.close();
    }
}