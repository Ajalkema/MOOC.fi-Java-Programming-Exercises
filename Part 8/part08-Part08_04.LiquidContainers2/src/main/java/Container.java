public class Container {
    private int value;

    public Container() {
        this.value = 0;
    }

    public int contains() {
        return this.value;
    }

    public void add(int amount) {
        if (amount > 0) {
            value+=amount;
            if (value > 100) value = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            value-=amount;
            if (value < 0) value = 0;
        }
    }

    public String toString() {
        return value + "/100";
    }
}
