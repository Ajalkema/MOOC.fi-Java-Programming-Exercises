import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(5);
        intList.add(2);
        intList.add(6);
        intList.add(21);
        intList.add(3);

        for (int i = intList.size(); i > 0; i--) {
            System.out.println(intList.get(i-1));
        }

    }    
}
