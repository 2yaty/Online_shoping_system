package DTO;

public class UncountableProduct extends Product implements Sellable , Uncountable{



    public UncountableProduct(int id, String name, Number amount, float price) {
        super(id, name, amount, price);


    }

    @Override
    public float getCost() {
        return super.getPrice();
    }

    @Override
    public void updateAmount(Number a) {
        super.setAmount(a);
    }

    @Override
    public float getWeight() {
        return (float) super.getAmount();
    }
}
