import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int currentWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        int potentialWeight = this.currentWeight + suitcase.totalWeight();

        if (potentialWeight <= this.maxWeight) {
            this.suitcases.add(suitcase);
            this.currentWeight = potentialWeight;
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.currentWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase sc : suitcases) {
            sc.printItems();
        }
    }
}
