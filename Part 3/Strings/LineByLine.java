import java.util.Scanner;
public class LineByLine {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Write a sentence");
        String sentence = reader.nextLine();
        String[] array = sentence.split(" ");

        if (sentence.equals("")) {
            System.out.println("Halted");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
            reader.close();
        }
    }
}
