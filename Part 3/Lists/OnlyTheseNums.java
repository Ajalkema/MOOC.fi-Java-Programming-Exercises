import java.util.Scanner;
import java.util.ArrayList;

public class OnlyTheseNums {
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

        System.out.println("Vanaf waar tot waar printen?");

        int start = Integer.valueOf(scanner.nextLine());
        int end = Integer.valueOf(scanner.nextLine());
        
        for (int i = (start-1); i < end; i++) {
            System.out.println(intList.get(i));
        }

        scanner.close();
    }
}

