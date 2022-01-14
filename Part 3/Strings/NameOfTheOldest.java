import java.util.Scanner;
public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageOldest = 0;
        String nameOldest = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] splitInput = input.split(",");
            int age = Integer.valueOf(splitInput[1]);
            String name = splitInput[0];
            if (age > ageOldest) {
                ageOldest = age;
                nameOldest = name; 
            }
        }
        System.out.println("Name of the oldest: "+nameOldest);
        scanner.close();
    }
}
