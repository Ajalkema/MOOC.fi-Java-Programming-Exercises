import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Print positive integer");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }

            if (num < 0) {
                System.out.println("Mongool");
                continue;
            }         
            
            System.out.println("Jouw getal is niet : " + (num * num));
        }

        scanner.close();
    }
}

//----------------------------------------------------------------
// Integers declared inside a loop cannot be used outside the loop
//----------------------------------------------------------------