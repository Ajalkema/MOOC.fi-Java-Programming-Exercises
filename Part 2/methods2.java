import java.util.Scanner;

public class methods2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numer = Integer.valueOf(scanner.nextLine());
        int denom = Integer.valueOf(scanner.nextLine());

        divisor(numer, denom);

        scanner.close();
    }

    public static void divisor(int numer, int denom) {
        if (denom == 0) {
            System.out.println("Mongool");
            return;
        }

        System.out.println(numer + " / " + denom + " = " + (numer / denom));
    }
}
