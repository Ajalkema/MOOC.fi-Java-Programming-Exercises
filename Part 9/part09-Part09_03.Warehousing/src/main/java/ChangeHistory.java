import java.util.*;

public class ChangeHistory {
    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        this.changeHistory.add(status);
    }

    public void clear() {
        this.changeHistory.clear();
    }

    public String toString() {
        return changeHistory.toString();
    }

    public double maxValue() {
        if (changeHistory.size() == 0) return 0.0;
        double placeholderMax = changeHistory.get(0);

        for (Double d : changeHistory) {
            if (d > placeholderMax) placeholderMax = d;
        }

        return placeholderMax;
    }

    public double minValue() {
        if (changeHistory.size() == 0) return 0.0;
        double placeholderMin = changeHistory.get(0);

        for (Double d : changeHistory) {
            if (d < placeholderMin) placeholderMin = d;
        }

        return placeholderMin;
    }

    public double average() {
        if (changeHistory.size() == 0) return 0.0;
        double sum = 0;
        int count = 0;

        for (Double d : changeHistory) {
            sum+=d;
            count++;
        }

        return sum / count;
    }
}
