import java.util.ArrayList;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void addItem(Item item) {
        
        int potentialWeight = this.currentWeight + item.getWeight();

        if (potentialWeight <= maxWeight) {
            this.items.add(item);
            this.currentWeight = potentialWeight;
        }        
    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i.getName() + " (" + i.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) return null;

        Item heaviest = items.get(0);

        for (Item i : items) {
            if (i.getWeight() > heaviest.getWeight()) heaviest = i;
        }
        return heaviest;
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (items.size() == 1) {
            return items.size() + " item (" + this.currentWeight + " kg)";
        }
        return items.size() + " items (" + this.currentWeight + " kg)";
    }
}

