import java.util.Scanner;

public class loops3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numofnums = 0;
        int sumofnums = 0;
        int num = 0;

        System.out.println("Tiep nummbers om ze op te tellen. Tjÿp 0 om te stoppen.");

        while(true) {
            num = Integer.valueOf(scanner.nextLine());
            if(num == 0) {
                break;
            }

            numofnums++;
            sumofnums = sumofnums + num;
        }

        System.out.println("Num of nums: " + numofnums);
        System.out.println("Sum of nums: " + sumofnums);

        scanner.close();
    }
}
