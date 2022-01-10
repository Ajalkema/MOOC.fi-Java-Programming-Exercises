import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {6, 2, 8, 1, 3, 0, 9, 7};

        System.out.println("Search number: ");
        int numToSearch = Integer.valueOf(scanner.nextLine());

        Boolean indexFound = false;
        
        for (int i=0; i < array.length; i++) {
            if (array[i] == numToSearch) {
                System.out.println("That number is at index: " + i);
                indexFound = true;
            }
        }

        if (!indexFound) {
            System.out.println("Number not found");
        }
        

        scanner.close();
    }    
}
