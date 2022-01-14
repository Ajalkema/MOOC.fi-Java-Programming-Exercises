import java.util.Scanner;

public class calculating {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Welke twee getallen gaan we vermenigvuldigen?");
       
       int first = Integer.valueOf(scanner.nextLine());
       int second = Integer.valueOf(scanner.nextLine());
       int answer = first * second;

       System.out.println(first + " x " + second + " = " + answer);

       scanner.close();
    }
}