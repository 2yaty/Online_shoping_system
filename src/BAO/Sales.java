package BAO;
import DAO.*;
import DTO.*;
import java.util.ArrayList;
import java.util.Map;

public class Sales {
    private static ArrayList<Payment> sold = new ArrayList<>();

    public static void makePayment (Customer customer , Cart cart){
        sold.add(new Payment(customer , cart));
        Map<Sellable , Number> theCart = cart.getCart();
        for (Sellable product : theCart.keySet()) {
            if (product instanceof Countable){
               int currentAmount = (int)product.getAmount();
               int soldAmount=(int) theCart.get(product);
               product.updateAmount( currentAmount-soldAmount);
            }
            else {
                float currentAmount = (float)product.getAmount();
                float soldAmount=(float) theCart.get(product);
                product.updateAmount( currentAmount-soldAmount);

            }
        }
    }
}
