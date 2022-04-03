import java.util.*;

public class Warehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Warehouse (){
        productPrice = new HashMap<>();
        productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        if (!productPrice.containsKey(product)){
            productPrice.put(product, price);
            productStock.put(product, stock);
        }
    }

    public int price(String product) {
        if (!productPrice.containsKey(product)) return -99;
        return productPrice.get(product);
    }

    public int stock(String product) {
        if (!productStock.containsKey(product)) return 0;
        return productStock.get(product);
    }

    public boolean take(String product) {
        if (productStock.containsKey(product)) {
            int currentStock = productStock.get(product);
            if (currentStock > 0) {
                productStock.put(product, --currentStock);
                return true;
            } else return false;
        } else return false;
    }

    public Set<String> products(){
        return productPrice.keySet();
    }
}
