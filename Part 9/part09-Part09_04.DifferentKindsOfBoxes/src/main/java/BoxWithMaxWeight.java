import java.util.*;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (currentWeight() + item.getWeight() <= capacity) {
            this.items.add(item);
        }
    }

    public boolean isInBox(Item item) {
        for (Item i : this.items) {
            if (i.equals(item)) return true;
        }

        return false;
    }

    public int currentWeight() {
        int currentWeight = 0;
        for (Item item : items) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }
}
