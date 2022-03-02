
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);

    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i=0;i < array.length; i++) {
            if (array[i] < smallest) smallest = array[i];
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        for (int i=0;i < array.length; i++) {
            if (array[i] < array[smallestIndex]) smallestIndex = i;
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        for (int i=startIndex;i < table.length; i++) {
            if (table[i] < table[smallestIndex]) smallestIndex = i;
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int placeholder = array[index1];
        array[index1] = array[index2];
        array[index2] = placeholder;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i=0; i<array.length; i++) {
            MainProgram.swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

}
