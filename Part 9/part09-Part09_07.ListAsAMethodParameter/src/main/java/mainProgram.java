import java.util.*;

public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");
        
        System.out.println(returnSize(names));
    }

    public static int returnSize(List list){
        return list.size();
    }

}
