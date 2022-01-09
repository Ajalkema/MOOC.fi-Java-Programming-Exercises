import java.util.Scanner;
import java.util.ArrayList;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();

        while (true) {
            int integer = Integer.valueOf(scanner.nextLine());
            if (integer == 0) {
                break;
            } 
            intList.add(integer);
        }

        System.out.println(intList.get(1) + intList.get(2));

        scanner.close();
    }
}

