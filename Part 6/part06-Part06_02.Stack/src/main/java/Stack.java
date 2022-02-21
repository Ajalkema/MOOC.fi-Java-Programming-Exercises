import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stackList;

    public Stack(){
        this.stackList = new ArrayList<String>();
    }

    public boolean isEmpty() {
        if (stackList.isEmpty()) return true;
        return false;
    }

    public void add(String value) {
        stackList.add(value);
    }

    public ArrayList<String> values() {
        return stackList;
    }

    public String take() {
        String last = stackList.get(stackList.size()-1);
        stackList.remove(stackList.size()-1);
        return last;
    }

}
