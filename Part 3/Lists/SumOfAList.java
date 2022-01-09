import java.util.Scanner;
import java.util.ArrayList;

public class SumOfAList {
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

        int sum = 0;

        for (Integer num: intList){
            sum = sum + num;
        }
        
        System.out.println("Sum of list is: " + sum);

        scanner.close();
    }
}
