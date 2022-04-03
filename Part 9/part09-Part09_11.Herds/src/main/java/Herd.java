import java.util.*;

public class Herd implements Movable {
    private ArrayList<Movable> herd;

    public Herd() {
        herd = new ArrayList<>();
    }

    public void addToHerd(Movable moveable) {
        if (!herd.contains(moveable)) herd.add(moveable);
    }

    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }

    public String toString() {
        String stringToReturn = "";
        for (Movable moveable : herd) {
            stringToReturn += moveable.toString() + "\n";
        }
        return stringToReturn;
    }
}
