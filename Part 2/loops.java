import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int numsRead = 0;
        int sum = 0;

        while (true) { 
            if (numsRead >= 5) {
                break;
            }
        
            int num = Integer.valueOf(scanner.nextLine());
            sum = sum + num;

            numsRead = numsRead + 1;
        }

        System.out.print("Sum is: " + sum);
        scanner.close();
    }    
}
