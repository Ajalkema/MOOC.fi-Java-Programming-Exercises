import java.util.Scanner;

public class PrintThrice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give a word: ");
        String word = reader.nextLine();
        System.out.println(word + word + word);

        reader.close();
    }
}
