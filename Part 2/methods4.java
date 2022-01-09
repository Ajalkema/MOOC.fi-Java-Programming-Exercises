public class methods4 {
    public static void main(String[] args) {
        int answer = greatest(5,2,7);
        System.out.println("greatest: " + answer);
    }

    public static int greatest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
