import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> products;

    public ShoppingBasket() {
        products = new HashMap<String, Purchase>();
    }

    public void add(String product, int price){
        if(products.keySet().contains(product)){
            products.get(product).increaseAmount();
        }else{
            products.put(product, new Purchase(product, 1, price));
        }

    }

    public int price(){
        int sum = 0;
        for (Purchase p : products.values()) {
            sum += p.price();
        }
        return sum;
    }

    public void print(){
        for (Purchase p: products.values()) {
            System.out.println(p);
        }
    }
}
