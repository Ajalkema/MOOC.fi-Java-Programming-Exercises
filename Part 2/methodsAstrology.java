public class methodsAstrology {
    public static void printSpaces(int number) {
        for (int i=0; i<number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }

        System.out.println("");
    }

    public static void christmasTree(int height) {
        for (int i=1; i <= (height); i++) {
            printSpaces(height - i);
            printStars(i*2 - 1);
        }

        for (int y=0; y<2; y++){
            printSpaces(height-2);
            printStars(3);
        }
        
    }

    public static void main(String[] args) {
        christmasTree(10);
    }
}
