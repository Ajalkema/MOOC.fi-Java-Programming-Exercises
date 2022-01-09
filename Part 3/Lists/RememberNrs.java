import java.util.Scanner;
import java.util.ArrayList;

public class RememberNrs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();

        while (true) {
            int integer = Integer.valueOf(scanner.nextLine());
            if (integer == -1) {
                break;
            } 
            intList.add(integer);
        }

        
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        scanner.close();
    }
}

