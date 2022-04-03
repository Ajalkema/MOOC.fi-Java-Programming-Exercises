import java.util.*;

public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> contents;

    public Box(double capacity) {
        this.capacity = capacity;
        this.contents = new ArrayList<>();
    }

    public double weight() {
        double sumWeight = 0;
        for (Packable item : contents) {
            sumWeight += item.weight();
        }
        return sumWeight;
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= capacity) {
            contents.add(item);
        }
    }

    public String toString() {
        return "Box: " + contents.size() + " items, total weight " + weight() + " kg";
    }

}
