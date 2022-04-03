import java.util.*;

public class ShoppingCart {
    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (!shoppingCart.containsKey(product)) {
            shoppingCart.put(product, new Item(product, 1, price));
        } else {
            Item item = shoppingCart.get(product);
            item.increaseQuantity();
        }
    }

    public int price() {
        int priceSum = 0;
        for (Item item : shoppingCart.values()) {
            priceSum += item.price();
        }
        return priceSum;
    }

    public void print() {
        for (Item item : shoppingCart.values()) {
            System.out.println(item);
        }
    }
}
