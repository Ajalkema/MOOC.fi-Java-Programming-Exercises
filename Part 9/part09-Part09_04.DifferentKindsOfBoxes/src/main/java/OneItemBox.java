public class OneItemBox extends Box {
    private Item itemInBox;

    public OneItemBox() {
        itemInBox = null;
    }

    public void add(Item item) {
        if (itemInBox == null) itemInBox = item;
    }

    public boolean isInBox(Item item) {
        if (!(itemInBox == null)){
            if (itemInBox.equals(item)) return true;
        }
        return false;
    }
}
