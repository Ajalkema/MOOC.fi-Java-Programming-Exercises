import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }        
        System.out.println("");

        System.out.println("Which indices to be swapped?");
        int IndextoSwap1 = Integer.valueOf(scanner.nextLine());
        int Indextoswap2 = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        
        int helper = array[IndextoSwap1];
        array[IndextoSwap1] = array[Indextoswap2];
        array[Indextoswap2] = helper;

        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }

        scanner.close();

    }
}