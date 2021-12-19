import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private int id ;
    private float Total;

    private Map<Sellable , Number> cart = new HashMap<>();

    public void addProduct (Sellable product , Number amount){
        cart.put(product , amount);
        Total +=  (product.getCost()*(int)amount);
    }
    public void removeProduct( Sellable product){
        cart.remove(product);
        Total -= product.getCost();

    }
    public int getNumberOfProducts(){
        return cart.size();
    }

    public float getTotal() {
        return Total;
    }

    public Map<Sellable , Number> getCart() {
        return cart;
    }

    public void removeCart (){
        cart.clear();
    }
}
