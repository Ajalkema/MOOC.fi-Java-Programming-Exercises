public class methodsStars {
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }

        System.out.println("");
    }
    
    public static void printSquare(int number) {
        for (int i = 0; i < number; i++) {
            printStars(number);
        }
    }
    
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i < (size + 1); i++) {
            printStars(i);
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}
