import java.util.Scanner;
public class PersonalDetails {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String longestName = "";
        int sumBirthYear = 0;
        int counter = 0;

        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] array = input.split(",");
            String name = array[0];
            int age = Integer.valueOf(array[1]);
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            sumBirthYear += age;
            counter++;
        }
        System.out.println("Longest name: " + longestName);
        double avgBirthyear = 1.0 * sumBirthYear / counter;
        System.out.println("Average of the birth years: " + avgBirthyear);
        reader.close();
    }
}
